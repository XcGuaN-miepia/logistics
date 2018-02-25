package cn.zzt.graduation.logistics.client.widget.iconfont;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.ui.HTML;

/**  
 * 图标   
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午2:58:58
 */
public class IconFont extends HTML{
	public IconFont(){
		this.getElement().getStyle().setDisplay(Display.INLINE);
		setIconSize(40);
		this.getElement().getStyle().setProperty("lineHeight", "1em");
	}
	
	/**
	 * 设置图标class名称，默认大小为16px
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午3:03:10 
	 * @param iconName
	 */
	public void setIconName(String iconName){
		this.addStyleName("icon iconfont "+iconName);
	}
	/**
	 * 设置图标大小
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午3:08:38 
	 * @param fontSize
	 */
	public void setIconSize(int fontSize){
		this.getElement().getStyle().setProperty("fontSize", fontSize+"px");;
	}
	/**
	 * 设置图标颜色
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午3:09:54 
	 * @param fontColor
	 */
	public void setIconColor(String fontColor){
		this.getElement().getStyle().setColor(fontColor);
	}
	public void setIconBgColor(String bgColor){
		this.getElement().getStyle().setBackgroundColor(bgColor);
	}
}
