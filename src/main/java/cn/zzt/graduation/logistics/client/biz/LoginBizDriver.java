package cn.zzt.graduation.logistics.client.biz;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.util.XJsonUtil;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
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
			public void onSuccess(String result) {
				String state=XJsonUtil.getList(result).get(0).get("state").toString();
				if(state.equals("1")){
					Window.alert("登录成功");
					eventBus.fireEvent(new ModuleLoadEvent(LGinjector.INSTANCE.getPlaceFactory().getMyPlace()));
				}
				else{
					Window.alert("账号或密码错误");
				}
			}
		});

	}

}
