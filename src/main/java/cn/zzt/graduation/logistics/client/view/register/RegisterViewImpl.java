package cn.zzt.graduation.logistics.client.view.register;

import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.zzt.graduation.logistics.client.widget.input.PasswordInput;
import cn.zzt.graduation.logistics.client.widget.input.PhoneNoInput;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RegisterViewImpl extends Composite implements RegisterView {

	private static RegisterViewImplUiBinder uiBinder = GWT
			.create(RegisterViewImplUiBinder.class);

	interface RegisterViewImplUiBinder extends
			UiBinder<Widget, RegisterViewImpl> {
	}

	@UiField
	Button register;
	@UiField
	PhoneNoInput telInput;
	@UiField
	PasswordInput pwdInput;

	private RegisterPresenter presenter;

	@UiHandler("register")
	void addRegisterHandler(ClickEvent event) {
		if (!telInput.valid()) {
			XGinjector.INSTANCE.getILog().logMsg("手机号信息", "手机号错误");
		} else if (!pwdInput.valid()) {
			XGinjector.INSTANCE.getILog().logMsg("密码信息", "密码错误");
		} else {
			presenter.register(telInput.getValue(), pwdInput.getValue());
		}
	}

	public RegisterViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setViewPresenter(IViewPresenter presenter) {
		this.presenter = (RegisterPresenter) presenter;
	}

	@Override
	public void initView() {
		// TODO Auto-generated method stub

	}

}
