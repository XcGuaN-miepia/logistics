package cn.zzt.graduation.logistics.client.biz;

import java.util.HashMap;
import java.util.Map;

import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.cordova.toast.ToastCallback;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.util.XJsonUtil;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.register.RegisterPresenter;

public class RegisterBizDriver extends BizDriverAbsImpl implements
		RegisterPresenter {

	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispath() {
		// TODO Auto-generated method stub

	}

	@Override
	public void register(String tel, String pw) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("TEL", tel);
		map.put("PASSWD", pw);
		ajaxHelper.post("Register", map, new AjaxAsyncCallback() {
			
			@Override
			public void onSuccess(String result) {
				String state=XJsonUtil.getList(result).get(0).get("STATE").toString();
				if(state=="0"){
					XGinjector.INSTANCE.getToast().showBottom("用户已存在", new ToastCallback() {
						
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
					XGinjector.INSTANCE.getToast().showBottom("注册成功", new ToastCallback() {
						
						@Override
						public void onSuccess() {
							eventBus.fireEvent(new ModuleLoadEvent(LGinjector.INSTANCE.getPlaceFactory().getLoginPlace()));
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
