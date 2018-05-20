package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.biz.ModifyInfoBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.modifyinfo.ModifyInfoView;

public class ModifyInfo extends PlaceBindAbsPage{
	
	private ModifyInfoView modifyInfoView;
	private ModifyInfoBizDriver modifyInfoBizDriver;
	
	public ModifyInfo() {
		modifyInfoBizDriver=LGinjector.INSTANCE.getModifyInfoBizDriver();
		modifyInfoView=LGinjector.INSTANCE.getModifyInfoView();
	}
	
	@Override
	public IBizDriver getBizDriver() {
		// TODO Auto-generated method stub
		return modifyInfoBizDriver;
	}

	@Override
	public AppView getUI() {
		// TODO Auto-generated method stub
		return modifyInfoView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		// TODO Auto-generated method stub
		return null;
	}

}
