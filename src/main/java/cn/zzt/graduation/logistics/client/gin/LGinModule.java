package cn.zzt.graduation.logistics.client.gin;


import cn.zzt.graduation.logistics.client.messages.LMessages;
import cn.zzt.graduation.logistics.client.model.login.LoginBizDriver;
import cn.zzt.graduation.logistics.client.theme.FlexAppearance;
import cn.zzt.graduation.logistics.client.view.login.LoginView;
import cn.zzt.graduation.logistics.client.view.login.LoginViewImpl;

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
		
		bind(LMessages.class).in(Singleton.class);
		
		
	}

}
