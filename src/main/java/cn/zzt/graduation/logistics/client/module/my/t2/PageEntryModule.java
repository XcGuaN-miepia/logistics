package cn.zzt.graduation.logistics.client.module.my.t2;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.util.CordovaUtils;
import cn.easysw.mobileframework.client.util.StyleUtils;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.util.UserBean;
import cn.zzt.graduation.logistics.client.widget.button.AboutUsIcon;
import cn.zzt.graduation.logistics.client.widget.button.AddrIcon;
import cn.zzt.graduation.logistics.client.widget.button.CustomIcon;
import cn.zzt.graduation.logistics.client.widget.button.SettingIcon;
import cn.zzt.graduation.logistics.client.widget.iconfont.IconFont;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

/**
 * 我的页面-横向入口
 * 
 * @author zhangtao.zhou
 * @version 2018年3月28日下午2:17:51
 */
public class PageEntryModule extends FlowPanel {

	public enum PageEntryType {
		ADDR, SETTING, CUSTOM, ABOUTUS;
	}

	private UserBean userBean = LGinjector.INSTANCE.getUserBean();
	private Place place;
	private PageEntryType type;
	private IconFont iconFont;
	private HTML textHTML;

	/**
	 * 构造方法
	 *
	 * @author zhangtao.zhou
	 * @version 2018年3月28日 下午5:52:00
	 */
	public PageEntryModule() {
		this.addStyleName(XGinjector.INSTANCE.getFlexAppearance().css().flexH());
		this.addStyleName(XGinjector.INSTANCE.getFlexAppearance().css()
				.flexVC());

		this.setHeight(CordovaUtils.px2(110) + "px");
		this.getElement().getStyle().setColor("#333");
		this.getElement().getStyle().setProperty("background", "#fff");
		this.getElement().getStyle().setProperty("padding", "0rem 0.706667rem");

		this.addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				if (userBean.hasLogin()) {
					XGinjector.INSTANCE.getEventBus().fireEvent(
							new ModuleLoadEvent(place));
				} else {
					XGinjector.INSTANCE.getEventBus().fireEvent(
							new ModuleLoadEvent(LGinjector.INSTANCE
									.getPlaceFactory().getLoginPlace()));
				}
			}
		}, ClickEvent.getType());
	}

	/**
	 * 添加底部边框
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 上午10:47:26
	 */
	public void addBorder() {
		this.getElement()
				.getStyle()
				.setProperty("borderBottom",
						StyleUtils.getBorder1PXString("#ddd"));
	}

	/**
	 * 设置类型
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 上午10:59:51
	 * @param type
	 */
	public void setEntryType(PageEntryType type){
		this.type=type;
		switch (type) {
		case ADDR:
			this.iconFont=new AddrIcon();
//			place=LGinjector.INSTANCE.getPlaceFactory().;
			break;
		case CUSTOM:
			this.iconFont=new CustomIcon();
//			place=LGinjector.INSTANCE.getPlaceFactory().;
			break;
		case ABOUTUS:
			this.iconFont=new AboutUsIcon();
//			place=LGinjector.INSTANCE.getPlaceFactory().;
			break;
		case SETTING:
			this.iconFont=new SettingIcon();
//			place=LGinjector.INSTANCE.getPlaceFactory().;
			break;
		default:
			break;
		}
		init();
	}
	
	/**
	 * 设置类型文字
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 上午11:00:36
	 * @param text
	 */
	public void setEntryText(String text){
		textHTML = new HTML();
		textHTML.setText(text);
		textHTML.getElement().getStyle().setProperty("marginLeft", CordovaUtils.px2(36) + "px");
		textHTML.getElement().getStyle().setProperty("fontSize", StyleUtils.getFontSizeByDpr2(28));

		init();
	}
	
	private void init(){
		if (iconFont !=null&&textHTML!=null){
			this.add(iconFont);
			this.add(textHTML);
		}
	}
}
