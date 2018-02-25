package cn.zzt.graduation.logistics.client.view.login;

import cn.easysw.mobileframework.client.framework.IViewPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
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
	
	private LoginPresenter presenter;

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
