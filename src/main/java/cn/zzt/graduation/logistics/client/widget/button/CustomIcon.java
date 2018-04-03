package cn.zzt.graduation.logistics.client.widget.button;

import cn.zzt.graduation.logistics.client.widget.iconfont.IconFont;

public class CustomIcon extends IconFont{

	public CustomIcon() {
		super();
		
		this.setIconName("icon-service");
		this.setIconSize(28);
		this.getElement().getStyle().setProperty("lineHeight", "1em");
	}
}
