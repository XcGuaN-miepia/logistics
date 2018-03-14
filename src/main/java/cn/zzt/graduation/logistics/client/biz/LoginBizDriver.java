package cn.zzt.graduation.logistics.client.biz;

import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.view.login.LoginPresenter;

public class LoginBizDriver extends BizDriverAbsImpl implements LoginPresenter{

	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispath() {
		ajaxHelper.post("servlet/HelloWorld", null, new AjaxAsyncCallback() {
			
			@Override
			public void onSuccess(String result) {
				Window.alert(result);
			}
			
		});
	}

	@Override
	public void login(String tel, String pw) {
		// TODO Auto-generated method stub
		
	}

}
