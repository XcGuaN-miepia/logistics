package cn.zzt.graduation.logistics.client.model.login;

import java.util.HashMap;
import java.util.Map;

import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.easysw.mobileframework.client.util.MD5Util;
import cn.xiaobu.web.citybeauty.client.ajax.AjaxAsyncCallback;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.view.login.LoginPresenter;

/**  
 * 登录业务处理类
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月19日  下午2:15:39
 */
public class LoginBizDriver extends BizDriverAbsImpl implements IBizDriver,LoginPresenter{

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
	public void flushCache(InitCallBack callBack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String tel, String pw) {
		Map<String , Object> result=new HashMap<String, Object>();
		result.put("USERNAME", tel);
		result.put("PASSWORD_MD5", MD5Util.getMD5String(pw));
		ajaxHelper.post("", result, 0, new AjaxAsyncCallback() {
			
			@Override
			public void onSuccess(String result) {
				
			}
		});
	}

}
