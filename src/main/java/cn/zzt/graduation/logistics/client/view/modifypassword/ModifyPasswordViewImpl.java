package cn.zzt.graduation.logistics.client.view.modifypassword;

import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.zzt.graduation.logistics.client.widget.input.PasswordInput;

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

public class ModifyPasswordViewImpl extends Composite implements
		ModifyPasswordView {

	private ModifyPasswordPresenter modifyPasswordPresenter;

	private static ModifyPasswordViewImplUiBinder uiBinder = GWT
			.create(ModifyPasswordViewImplUiBinder.class);

	interface ModifyPasswordViewImplUiBinder extends
			UiBinder<Widget, ModifyPasswordViewImpl> {
	}

	@UiField
	PasswordInput oldPasswd, newPasswd, newPasswd2;
	@UiField
	Button modifyPasswdBtn;

	@UiHandler("modifyPasswdBtn")
	void addModifyPasswordHandler(ClickEvent event) {
		if (modifyPasswordPresenter != null) {
			if (!oldPasswd.getValue().isEmpty() && oldPasswd.getValue() != null) {
				if (!newPasswd.getValue().isEmpty()
						&& newPasswd.getValue() != null
						&& !newPasswd2.getValue().isEmpty()
						&& newPasswd2.getValue() != null) {
					modifyPasswordPresenter.modifyPassword(
							oldPasswd.getValue(), newPasswd.getValue(),
							newPasswd2.getValue());
				}else{
					XGinjector.INSTANCE.getToast().showBottom("请输入新密码", null);
				}
			} else {
				XGinjector.INSTANCE.getToast().showBottom("请输入旧密码", null);
			}
		}
	}

	public ModifyPasswordViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setViewPresenter(IViewPresenter presenter) {
		this.modifyPasswordPresenter = (ModifyPasswordPresenter) presenter;
	}

	@Override
	public void initView() {
		// TODO Auto-generated method stub

	}

}
