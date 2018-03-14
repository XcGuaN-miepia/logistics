package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.xiaobu.web.citybeauty.client.framework.OKCityAbsPageV2;
import cn.zzt.graduation.logistics.client.biz.LoginBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.login.LoginView;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Login extends OKCityAbsPageV2 {
	
	private LoginBizDriver loginBizDriver;
	private LoginView loginView;
	
	public Login(){
		loginBizDriver=LGinjector.INSTANCE.getLoginBizDriver();
		loginView=LGinjector.INSTANCE.getLoginView();
	}
	@Override
	public IBizDriver getBizDriver() {
		return loginBizDriver;
	}

	@Override
	public AppView getUI() {
		return loginView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		return loginBizDriver;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

 
}
