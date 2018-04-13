package cn.zzt.graduation.logistics.client.biz;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.util.XJsonUtil;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.modifypassword.ModifyPasswordPresenter;

public class ModifyPasswordBizDriver extends BizDriverAbsImpl implements
		ModifyPasswordPresenter {

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
	public void modifyPassword(String oldPasswd, String newPasswd,
			String newPasswd2) {
		if (newPasswd == newPasswd2) {
			if (oldPasswd != newPasswd) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("OLDPASSWD", oldPasswd);
				map.put("NEWPASSWD", newPasswd);
				ajaxHelper.post("ModifyPassword", map, new AjaxAsyncCallback() {

					@Override
					public void onSuccess(String result) {
						if (XJsonUtil.getBody(result).get("STATE").toString()=="1") {
							LGinjector.INSTANCE.getUserBean().clear();
							LGinjector.INSTANCE.getUserBean().updateToCache();
							XGinjector.INSTANCE.getToast().showBottom("密码修改成功",
									null);
							new Timer() {

								@Override
								public void run() {
									eventBus.fireEvent(new ModuleLoadEvent(
											LGinjector.INSTANCE
													.getPlaceFactory()
													.getLoginPlace()));
								}
							}.schedule(1500);
						} else {
							XGinjector.INSTANCE.getToast().showBottom("旧密码错误",
									null);
						}
					}
				});
			} else {
				XGinjector.INSTANCE.getToast().showBottom("新密码与旧密码相同", null);
			}
		} else {
			XGinjector.INSTANCE.getToast().showBottom("两次密码输入不用", null);
		}
	}

}
