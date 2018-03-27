package cn.zzt.graduation.logistics.client.biz;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;

import cn.xiaobu.web.citybeauty.client.framework.BizDriverAbsImpl;
import cn.zzt.graduation.logistics.client.view.my.MyView;

/**
 * 我的页面业务处理类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日上午9:40:13
 */
public class MyBizDriver extends BizDriverAbsImpl{

	@Inject
	MyView myView;
	
	@Override
	public HandlerRegistration addHandlerRegistration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void dispath() {
		myView.resetUserInfo();
	}

}

