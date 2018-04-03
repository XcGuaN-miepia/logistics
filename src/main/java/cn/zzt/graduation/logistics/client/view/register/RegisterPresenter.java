package cn.zzt.graduation.logistics.client.view.register;

import cn.easysw.mobileframework.client.framework.IViewPresenter;

public interface RegisterPresenter extends IViewPresenter {

	/**
	 * 注册
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 下午2:54:45
	 * @param tel
	 * @param pw
	 */
	public void register(String tel, String pw);
}
