package cn.zzt.graduation.logistics.client.biz;

import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.ISessionBean.FlushCallBack;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.my.MyView;

/**
 * 我的页面业务处理类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日上午9:40:13
 */
public class MyBizDriver extends BizDriverAbsImpl{

	@Inject
	MyView myView;
	
	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void dispath() {
		myView.resetUserInfo();
	}

	@Override
	public void flushCache(final InitCallBack callBack) {
		LGinjector.INSTANCE.getUserBean().flush(new FlushCallBack(){

			@Override
			public void onSuccess() {
				if(callBack!=null)
					callBack.onSuccess();
			}
			
		});
	}

}

