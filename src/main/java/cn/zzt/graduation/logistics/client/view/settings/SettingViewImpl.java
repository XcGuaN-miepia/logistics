package cn.zzt.graduation.logistics.client.view.settings;

import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.module.setting.SettingModule;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class SettingViewImpl extends Composite implements SettingView{

	private SettingPresenter presenter;
	
	private static SettingViewImplUiBinder uiBinder = GWT
			.create(SettingViewImplUiBinder.class);

	interface SettingViewImplUiBinder extends UiBinder<Widget, SettingViewImpl> {
	}
	@UiField
	SettingModule entry;
	@UiField
	Button logout;

	public SettingViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
		logout.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				presenter.logout();
			}
		});
	}
	

	@Override
	public void setViewPresenter(IViewPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initEntryModule(boolean hasLogin, boolean issetPwd) {
		entry.init(hasLogin, issetPwd);
	}

}
