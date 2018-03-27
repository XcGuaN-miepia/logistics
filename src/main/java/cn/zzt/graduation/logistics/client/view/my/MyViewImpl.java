package cn.zzt.graduation.logistics.client.view.my;

import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.zzt.graduation.logistics.client.module.my.userinfo.UserInfoModule;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * 我的页面UI实现类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月18日下午8:21:32
 */
public class MyViewImpl extends Composite implements MyView{

	private static MyViewImplUiBinder uiBinder = GWT
			.create(MyViewImplUiBinder.class);

	interface MyViewImplUiBinder extends UiBinder<Widget, MyViewImpl> {
	}
	
	@UiField
	UserInfoModule userinfo;
	
	public MyViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setViewPresenter(IViewPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetUserInfo() {
		userinfo.setData();
	}
}

