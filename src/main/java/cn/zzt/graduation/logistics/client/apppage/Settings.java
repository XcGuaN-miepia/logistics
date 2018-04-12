package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.biz.SettingBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.settings.SettingView;

public class Settings extends PlaceBindAbsPage{

	private SettingView settingView;
	private SettingBizDriver settingBizDriver;
	
	public Settings() {
		settingView=LGinjector.INSTANCE.getSettingView();
		settingBizDriver=LGinjector.INSTANCE.getSettingBizDriver();
	}
	
	@Override
	public IBizDriver getBizDriver() {
		// TODO Auto-generated method stub
		return settingBizDriver;
	}

	@Override
	public AppView getUI() {
		// TODO Auto-generated method stub
		return settingView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		// TODO Auto-generated method stub
		return settingBizDriver;
	}

}
