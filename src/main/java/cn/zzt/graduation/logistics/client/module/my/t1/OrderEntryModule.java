package cn.zzt.graduation.logistics.client.module.my.t1;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.util.CordovaUtils;
import cn.zzt.graduation.logistics.client.widget.iconfont.IconFont;

/**
 * 订单入口
 * 
 * @author zhangtao.zhou
 * @version 2018年3月28日下午2:23:12
 */
public class OrderEntryModule extends FlowPanel{
	
	private IconFont iconFont;
	private HTML textHTML;
	
	private enum OrderEnterType{
		TO_DELIVERY,TO_RECEIVE,TO_COMMENT,TO_ARRIVE,SERVICE;
	}
	
	private OrderEnterType orderEnterType;
	private int orderTabIndex;
	
	/** 
	 * 构造方法  
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月28日 下午2:32:27
	 */
	public OrderEntryModule() {
		this.addStyleName(XGinjector.INSTANCE.getFlexAppearance().css().flexV());
		this.addStyleName(XGinjector.INSTANCE.getFlexAppearance().css().flexVC());
		this.addStyleName(XGinjector.INSTANCE.getFlexAppearance().css().flexHS());
		this.getElement().getStyle().setProperty("marginTop", CordovaUtils.px2(40) + "px");

		iconFont = new IconFont();
		iconFont.setIconSize(44);
		iconFont.getElement().getStyle().setColor("#666");

		textHTML = new HTML();
		textHTML.addStyleName("fontsize22");
		textHTML.getElement().getStyle().setProperty("marginTop", CordovaUtils.px2(28) + "px");

		this.add(iconFont);
		this.add(textHTML);

		this.addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
//				if (entryType == EntryType.SERVICE) {
//					RefundPageUtils.pushToRefundList();
//				} else {
//					OrderPageUtils.pushToOrderList(orderTabIndex);
//				}
			}
		}, ClickEvent.getType());
	}
	
	/**
	 * 设置icon类型
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月28日 下午2:37:06
	 * @param type
	 */
	public void setEntryType(String type){
		this.orderEnterType=OrderEnterType.valueOf(type);
		//图标地址等之后加上
		switch (orderEnterType) {
		case TO_COMMENT:
			iconFont.setIconName("icon-activity");
			orderTabIndex=1;
			break;
		case TO_DELIVERY:
			iconFont.setIconName("icon-baoguofahuo-xianxing");
			orderTabIndex=2;
			break;
		case TO_ARRIVE:
			iconFont.setIconName("icon-qianshoushenpitongguo-xianxing");
			orderTabIndex=3;
			break;
		case TO_RECEIVE:
			iconFont.setIconName("icon-yunshuzhongwuliu-xianxing");
			orderTabIndex=4;
			break;
		case SERVICE:
			iconFont.setIconName("icon-tuikuan");
			orderTabIndex=5;
			break;
		default:
			break;
		}
	}
	
	/**
	 * 设置icon文本
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月28日 下午2:43:16
	 * @param text
	 */
	public void setEntryText(String text){
		textHTML.setText(text);
	}
}

