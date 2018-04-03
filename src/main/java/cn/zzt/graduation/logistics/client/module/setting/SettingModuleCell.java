package cn.zzt.graduation.logistics.client.module.setting;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

/**
 * 设置子模块
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午4:22:54
 */
public class SettingModuleCell extends Composite{

	private static SettingModuleCellUiBinder uiBinder = GWT
			.create(SettingModuleCellUiBinder.class);

	interface SettingModuleCellUiBinder extends
			UiBinder<Widget, SettingModuleCell> {
	}
	@UiField
	HTML text;
	@UiField
	FlowPanel mainpanel;
	public SettingModuleCell() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/**
	 * 设置名称
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年4月3日 下午4:29:16
	 * @param name
	 */
	public void setName(String name) {
		text.setText(name);
	}

	/**
	 * 清楚边框
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年4月3日 下午4:29:32
	 */
	public void clearBorder() {
		mainpanel.getElement().getStyle().setProperty("border", "none");
	}


}
