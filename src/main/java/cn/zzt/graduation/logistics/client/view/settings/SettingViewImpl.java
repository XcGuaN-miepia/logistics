package cn.zzt.graduation.logistics.client.view.settings;

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

public class SettingViewImpl extends Composite{

	private static SettingViewImplUiBinder uiBinder = GWT
			.create(SettingViewImplUiBinder.class);

	interface SettingViewImplUiBinder extends UiBinder<Widget, SettingViewImpl> {
	}

	public SettingViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
