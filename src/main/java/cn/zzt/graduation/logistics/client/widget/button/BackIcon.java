package cn.zzt.graduation.logistics.client.widget.button;

import cn.zzt.graduation.logistics.client.widget.iconfont.IconFont;


/**  
 * 后退图标
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午2:57:57
 */
public class BackIcon extends IconFont{
	
	public BackIcon(){
		super();
		
		this.setIconName("icon-back");
		this.getElement().getStyle().setProperty("lineHeight", "1em");
	}
}
