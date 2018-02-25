package cn.zzt.graduation.logistics.client.view.login;

import cn.easysw.mobileframework.client.framework.AppView;

/**  
 * 密码登录UI接口定义
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午2:04:15
 */
public interface LoginView extends AppView{
	/**
	 * 展示错误信息
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月19日 下午1:56:02 
	 * @param str
	 */
	void showErrorHint(String str);
}
