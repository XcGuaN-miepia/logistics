package cn.zzt.graduation.logistics.client.view.settings;

import cn.easysw.mobileframework.client.framework.AppView;

/**
 * 设置页面UI接口
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午4:53:00
 */
public interface SettingView extends AppView{
	/**
	 * 展示入口
	 * 
	 * @author tao.xie
	 * @version 2017年6月30日 下午2:48:52
	 * @param hasLogin
	 * @param issetPwd
	 */
	void initEntryModule(boolean hasLogin, boolean issetPwd);
}
