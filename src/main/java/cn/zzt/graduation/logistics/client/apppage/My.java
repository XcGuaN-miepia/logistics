package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.xiaobu.web.citybeauty.client.framework.OKCityAbsPageV2;
import cn.zzt.graduation.logistics.client.biz.MyBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.my.MyView;

/**
 * 我的页面
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日上午9:39:38
 */
public class My extends PlaceBindAbsPage{
	
	private MyView myView;
	private MyBizDriver myBizDriver;
	
	public My() {
		myView=LGinjector.INSTANCE.getMyView();
		myBizDriver=LGinjector.INSTANCE.getMyBizDriver();
	}
	
	@Override
	public IBizDriver getBizDriver() {
		// TODO Auto-generated method stub
		return myBizDriver;
	}

	@Override
	public AppView getUI() {
		// TODO Auto-generated method stub
		return myView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		// TODO Auto-generated method stub
		return null;
	}

}

