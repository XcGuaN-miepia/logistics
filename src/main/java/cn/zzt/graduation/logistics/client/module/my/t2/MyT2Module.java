package cn.zzt.graduation.logistics.client.module.my.t2;

import cn.zzt.graduation.logistics.client.module.my.t2.PageEntryModule.PageEntryType;

import com.google.gwt.user.client.ui.FlowPanel;

public class MyT2Module extends FlowPanel{
	private PageEntryModule pageEntryModule;
	
	public MyT2Module() {
		pageEntryModule=new PageEntryModule();
		pageEntryModule.setEntryType(PageEntryType.ADDR);
		pageEntryModule.setEntryText("地址管理");
		pageEntryModule.addBorder();
		this.add(pageEntryModule);
		
		pageEntryModule=new PageEntryModule();
		pageEntryModule.setEntryType(PageEntryType.CUSTOM);
		pageEntryModule.setEntryText("客服咨询");
		pageEntryModule.addBorder();
		this.add(pageEntryModule);

		pageEntryModule=new PageEntryModule();
		pageEntryModule.setEntryType(PageEntryType.SETTING);
		pageEntryModule.setEntryText("设置");
		pageEntryModule.addBorder();
		this.add(pageEntryModule);

		pageEntryModule=new PageEntryModule();
		pageEntryModule.setEntryType(PageEntryType.ABOUTUS);
		pageEntryModule.setEntryText("关于我们");
		this.add(pageEntryModule);
	}
}
