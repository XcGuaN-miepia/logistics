package cn.zzt.graduation.logistics.client.gin;


import cn.zzt.graduation.logistics.client.biz.LoginBizDriver;
import cn.zzt.graduation.logistics.client.biz.LogisticsListBizDriver;
import cn.zzt.graduation.logistics.client.biz.ModifyInfoBizDriver;
import cn.zzt.graduation.logistics.client.biz.ModifyPasswordBizDriver;
import cn.zzt.graduation.logistics.client.biz.MyBizDriver;
import cn.zzt.graduation.logistics.client.biz.RegisterBizDriver;
import cn.zzt.graduation.logistics.client.biz.SettingBizDriver;
import cn.zzt.graduation.logistics.client.messages.LMessages;
import cn.zzt.graduation.logistics.client.mvp.HistoryMapper;
import cn.zzt.graduation.logistics.client.mvp.PlaceFactory;
import cn.zzt.graduation.logistics.client.util.UserBean;
import cn.zzt.graduation.logistics.client.view.login.LoginView;
import cn.zzt.graduation.logistics.client.view.login.LoginViewImpl;
import cn.zzt.graduation.logistics.client.view.logisticslist.LogisticsListView;
import cn.zzt.graduation.logistics.client.view.logisticslist.LogisticsListViewImpl;
import cn.zzt.graduation.logistics.client.view.modifyinfo.ModifyInfoView;
import cn.zzt.graduation.logistics.client.view.modifyinfo.ModifyInfoViewImpl;
import cn.zzt.graduation.logistics.client.view.modifypassword.ModifyPasswordView;
import cn.zzt.graduation.logistics.client.view.modifypassword.ModifyPasswordViewImpl;
import cn.zzt.graduation.logistics.client.view.my.MyView;
import cn.zzt.graduation.logistics.client.view.my.MyViewImpl;
import cn.zzt.graduation.logistics.client.view.register.RegisterView;
import cn.zzt.graduation.logistics.client.view.register.RegisterViewImpl;
import cn.zzt.graduation.logistics.client.view.settings.SettingView;
import cn.zzt.graduation.logistics.client.view.settings.SettingViewImpl;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**  
 * Gin绑定
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月19日  上午9:57:54
 */
public class LGinModule extends AbstractGinModule{

	@Override
	protected void configure() {
		
		bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
		bind(LoginBizDriver.class).in(Singleton.class);
		
		bind(MyView.class).to(MyViewImpl.class).in(Singleton.class);
		bind(MyBizDriver.class).in(Singleton.class);
		
		bind(LogisticsListView.class).to(LogisticsListViewImpl.class).in(Singleton.class);
		bind(LogisticsListBizDriver.class).in(Singleton.class);
		
		bind(RegisterView.class).to(RegisterViewImpl.class).in(Singleton.class);
		bind(RegisterBizDriver.class).in(Singleton.class);
		
		bind(SettingView.class).to(SettingViewImpl.class).in(Singleton.class);
		bind(SettingBizDriver.class).in(Singleton.class);
		
		bind(ModifyPasswordView.class).to(ModifyPasswordViewImpl.class).in(Singleton.class);
		bind(ModifyPasswordBizDriver.class).in(Singleton.class);
		
		bind(ModifyInfoView.class).to(ModifyInfoViewImpl.class).in(Singleton.class);
		bind(ModifyInfoBizDriver.class).in(Singleton.class);
		
		bind(LMessages.class).in(Singleton.class);
		bind(PlaceFactory.class).in(Singleton.class);
		bind(HistoryMapper.class).in(Singleton.class);
		bind(UserBean.class).in(Singleton.class);
		
		
	}

}
