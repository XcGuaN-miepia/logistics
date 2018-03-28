package cn.zzt.graduation.logistics.client.gin;


import cn.zzt.graduation.logistics.client.biz.LoginBizDriver;
import cn.zzt.graduation.logistics.client.biz.LogisticsListBizDriver;
import cn.zzt.graduation.logistics.client.biz.MyBizDriver;
import cn.zzt.graduation.logistics.client.messages.LMessages;
import cn.zzt.graduation.logistics.client.mvp.HistoryMapper;
import cn.zzt.graduation.logistics.client.mvp.PlaceFactory;
import cn.zzt.graduation.logistics.client.theme.FlexAppearance;
import cn.zzt.graduation.logistics.client.util.UserBean;
import cn.zzt.graduation.logistics.client.view.login.LoginView;
import cn.zzt.graduation.logistics.client.view.logisticslist.LogisticsListView;
import cn.zzt.graduation.logistics.client.view.my.MyView;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**  
 * Gin绑定接口
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月19日  上午9:58:10
 */
@GinModules(LGinModule.class)
public interface LGinjector extends Ginjector{
	public static final LGinjector INSTANCE=GWT.create(LGinjector.class);
	
	LoginView getLoginView();
	LoginBizDriver getLoginBizDriver();
	
	MyView getMyView();
	MyBizDriver getMyBizDriver();
	
	LogisticsListView getLogisticsListView();
	LogisticsListBizDriver getLogisticsListBizDriver();
	
	LMessages getLMessages();
	PlaceFactory getPlaceFactory();
	HistoryMapper getHistoryMapper();
	UserBean getUserBean();
	
	
}
