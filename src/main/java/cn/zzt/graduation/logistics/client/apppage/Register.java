package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.biz.RegisterBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.register.RegisterView;

public class Register extends PlaceBindAbsPage{
	
	private RegisterView registerView;
	private RegisterBizDriver registerBizDriver;
	
	public Register() {
		registerView=LGinjector.INSTANCE.getRegisterView();
		registerBizDriver=LGinjector.INSTANCE.getRegisterBizDriver();
	}
	
	@Override
	public IBizDriver getBizDriver() {
		// TODO Auto-generated method stub
		return registerBizDriver;
	}

	@Override
	public AppView getUI() {
		// TODO Auto-generated method stub
		return registerView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		// TODO Auto-generated method stub
		return registerBizDriver;
	}

}
