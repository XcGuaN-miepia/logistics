package cn.zzt.graduation.logistics.client.view.modifypassword;

import cn.easysw.mobileframework.client.framework.IViewPresenter;

public interface ModifyPasswordPresenter extends IViewPresenter{

	/**
	 * 修改密码
	 * @author zhangtao.zhou
	 * @version 2018年4月13日 上午10:14:07
	 * @param oldPasswd
	 * @param newPasswd
	 * @param newPasswd2
	 */
	public void modifyPassword(String oldPasswd,String newPasswd,String newPasswd2);
}
