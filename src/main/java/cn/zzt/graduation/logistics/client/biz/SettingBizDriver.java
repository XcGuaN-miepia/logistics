package cn.zzt.graduation.logistics.client.biz;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.IBizDriver.InitCallBack;
import cn.easysw.mobileframework.client.framework.ISessionBean.FlushCallBack;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.plugin2.ui.IUIPlugin.ConfirmDialogCallBack;
import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.settings.SettingPresenter;
import cn.zzt.graduation.logistics.client.view.settings.SettingView;

/**
 * 
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午5:17:42
 */
public class SettingBizDriver extends BizDriverAbsImpl implements SettingPresenter{

	@Inject
	SettingView settingView;
	
	@Override
	public void logout() {
		XGinjector.INSTANCE.getIuiPlugin().showConfirmDialog("提示", "确定要退出登录", new ConfirmDialogCallBack(){

			@Override
			public void ok() {
				LGinjector.INSTANCE.getUserBean().clear();
				LGinjector.INSTANCE.getUserBean().updateToCache();
				new Timer() {
					
					@Override
					public void run() {
						eventBus.fireEvent(new ModuleLoadEvent(LGinjector.INSTANCE.getPlaceFactory().getMyPlace()));
					}
				}.schedule(300);
			}

			@Override
			public void cancel() {
				// TODO Auto-generated method stub
				
			}
			
		}, "确定", "取消");
	}

	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispath() {
		settingView.initEntryModule(LGinjector.INSTANCE.getUserBean().hasLogin(), false);
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
