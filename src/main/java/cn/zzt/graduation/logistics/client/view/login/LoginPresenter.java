package cn.zzt.graduation.logistics.client.view.login;

import cn.easysw.mobileframework.client.framework.IViewPresenter;

/**  
 * 登录P层接口  
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午2:04:33
 */
public interface LoginPresenter extends IViewPresenter{
	/**
	 * 登录
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月23日 上午10:07:44 
	 * @param username
	 * @param pw
	 */
	void login(String tel,String pw,int type);
	

}
