package cn.zzt.graduation.logistics.client.module.my.t1;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

/**
 * 类说明
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日下午3:26:59
 */
public class MyT1Module extends Composite{

	private static MyT1ModuleUiBinder uiBinder = GWT
			.create(MyT1ModuleUiBinder.class);

	interface MyT1ModuleUiBinder extends UiBinder<Widget, MyT1Module> {
	}

	public MyT1Module() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}

