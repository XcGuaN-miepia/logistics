package cn.zzt.graduation.logistics.client.apppage;

import cn.easysw.mobileframework.client.framework.AppView;
import cn.easysw.mobileframework.client.framework.IBizDriver;
import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.biz.ModifyPasswordBizDriver;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.view.modifypassword.ModifyPasswordView;

public class ModifyPassword extends PlaceBindAbsPage{
	
	private ModifyPasswordView modifyPasswordView;
	private ModifyPasswordBizDriver modifyPasswordBizDriver;
	
	public ModifyPassword() {
		modifyPasswordView=LGinjector.INSTANCE.getModifyPasswordView();
		modifyPasswordBizDriver=LGinjector.INSTANCE.getModifyPasswordBizDriver();
	}
	
	@Override
	public IBizDriver getBizDriver() {
		// TODO Auto-generated method stub
		return modifyPasswordBizDriver;
	}

	@Override
	public AppView getUI() {
		// TODO Auto-generated method stub
		return modifyPasswordView;
	}

	@Override
	public IViewPresenter getViewPresenter() {
		// TODO Auto-generated method stub
		return modifyPasswordBizDriver;
	}

}
