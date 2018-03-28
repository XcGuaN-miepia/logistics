package cn.zzt.graduation.logistics.client.biz;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.cordova.toast.ToastCallback;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.util.XJsonUtil;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.util.UserBean;
import cn.zzt.graduation.logistics.client.view.login.LoginPresenter;

public class LoginBizDriver extends BizDriverAbsImpl implements LoginPresenter {
	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispath() {

	}

	@Override
	public void login(String tel, String pw,int type) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("TEL", tel);
		map.put("PASSWD", pw);
		map.put("USER_TYPE", type);
		ajaxHelper.post("LoginServlet", map, new AjaxAsyncCallback() {

			@Override
			public void onSuccess(final String result) {
				String state=XJsonUtil.getList(result).get(0).get("STATE").toString();
				if(state.equals("1")){
					XGinjector.INSTANCE.getToast().showBottom("登录成功", new ToastCallback() {

						@Override
						public void onSuccess() {
							UserBean userbean=LGinjector.INSTANCE.getUserBean();

							eventBus.fireEvent(new ModuleLoadEvent(LGinjector.INSTANCE.getPlaceFactory().getMyPlace()));
							userbean.parse(XJsonUtil.getJOBody(result));
							userbean.setIsLogin("1");
							userbean.updateToCache();
						}
						
						@Override
						public void onError() {
							// TODO Auto-generated method stub
							
						}
					});
				}else if(state.equals("0")){
					XGinjector.INSTANCE.getToast().show("账号或密码错误", new ToastCallback() {
						
						@Override
						public void onSuccess() {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onError() {
							// TODO Auto-generated method stub
							
						}
					});
				}else{
					XGinjector.INSTANCE.getToast().showBottom("用户名不存在", new ToastCallback() {
						
						@Override
						public void onSuccess() {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onError() {
							// TODO Auto-generated method stub
							
						}
					});
				}
			}
		});

	}

}
