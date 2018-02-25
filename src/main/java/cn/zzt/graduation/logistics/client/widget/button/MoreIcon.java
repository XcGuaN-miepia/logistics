package cn.zzt.graduation.logistics.client.widget.button;

import cn.zzt.graduation.logistics.client.widget.iconfont.IconFont;


/**  
 * 更多图标
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午3:17:12
 */
public class MoreIcon extends IconFont{
	
	public MoreIcon(){
		super();
		
		this.setIconName("icon-more");
		this.getElement().getStyle().setProperty("lineHeight", "1em");
	}
}
