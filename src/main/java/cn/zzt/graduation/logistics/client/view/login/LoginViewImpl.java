package cn.zzt.graduation.logistics.client.view.login;

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

/**  
 * 登录界面实现类
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午2:02:38
 */
public class LoginViewImpl extends Composite implements LoginView{

	private static LoginViewImplUiBinder uiBinder = GWT
			.create(LoginViewImplUiBinder.class);

	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {
	}
	
	@UiField
	Button login,change;
	@UiField
	PhoneNoInput telInput;
	@UiField
	PasswordInput pwdInput;
	
	private LoginPresenter presenter;
	private int userType=1; //默认客户用户
	
	@UiHandler("login")
	void addLoginHandler(ClickEvent event){
		if (!telInput.valid()) {
			XGinjector.INSTANCE.getILog().logMsg("手机号信息", "手机号错误");
		}else if(!pwdInput.valid()){
			XGinjector.INSTANCE.getILog().logMsg("密码信息", "密码错误");
		}else {
			presenter.login(telInput.getValue(), pwdInput.getValue(), userType);
		}
	}
	
	@UiHandler("change")
	void addChangeHandler(ClickEvent event){
		if (userType==1) {
			userType=0;
			XGinjector.INSTANCE.getILog().logMsg("userType", "userType="+userType+" 1是普通用户，0是快递员用户");
		}else {
			userType=1;
			XGinjector.INSTANCE.getILog().logMsg("userType", "userType="+userType+" 1是普通用户，0是快递员用户");
		}
	}

	public LoginViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setViewPresenter(IViewPresenter presenter) {
		this.presenter=(LoginPresenter) presenter;
	}

	@Override
	public void initView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showErrorHint(String str) {
		// TODO Auto-generated method stub
		
	}



}
