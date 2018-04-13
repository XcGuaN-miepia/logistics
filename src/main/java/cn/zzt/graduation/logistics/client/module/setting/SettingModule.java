package cn.zzt.graduation.logistics.client.module.setting;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.framework.event.ToastEvent;
import cn.easysw.mobileframework.client.framework.event.ToastEvent.TOAST_LEVEL;
import cn.easysw.mobileframework.client.plugin2.PluginDefaultHandler;
import cn.easysw.mobileframework.client.plugin2.ui.IUIPlugin.ConfirmDialogCallBack;
import cn.zzt.graduation.logistics.client.gin.LGinjector;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;

/**
 * 设置模块
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午4:11:58
 */
public class SettingModule extends FlowPanel{
	/**
	 * 设置页面的入口
	 * 
	 * @author yingying.fan
	 * @version 2017年4月28日下午2:25:06
	 */
	public enum SETTINGS_ENTER {
//		ABOUT_US, // 关于我们
//		FEED_BACK, // 问题反馈
		MODIFY_LOGIN_PWD, // 修改登录密码
//		SETTING_LOGIN_PWD, // 设置登录密码
		CLEAR_CACHE; // 清除缓存
	}

	private SettingModuleCell cell;

	/**
	 * 添加入口
	 * 
	 * @author yingying.fan
	 * @version 2017年4月28日 下午3:15:45
	 * @param name
	 * @param type
	 */
	private void addEntry(String name, final SETTINGS_ENTER type) {
		cell = new SettingModuleCell();
		cell.setName(name);
		this.add(cell);
		cell.addDomHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				goToEntry(type);
			}
		}, ClickEvent.getType());
	}

	/**
	 * 跳转入口
	 * 
	 * @author yingying.fan
	 * @version 2017年4月28日 下午3:15:56
	 * @param type
	 */
	private void goToEntry(SETTINGS_ENTER type) {
		switch (type) {
//			case ABOUT_US:
//				XGinjector.INSTANCE.getEventBus().fireEvent(new ModuleLoadEvent("module=city-app&page=aboutus"));
//				break;
//			case FEED_BACK:
//				go(JHXFrameGinjector.INSTANCE.getPlaceFactory().getFeedBackPlace());
//				break;
			case MODIFY_LOGIN_PWD:
				go(LGinjector.INSTANCE.getPlaceFactory().getModifyPasswordPlace());
				break;
//			case SETTING_LOGIN_PWD:
//				go(JHXFrameGinjector.INSTANCE.getPlaceFactory().getSetLoginPwdPlace());
//				break;
			case CLEAR_CACHE:
				clearCache();
				break;
			default:
				break;
		}
	}

	/**
	 * 根据place跳转
	 * 
	 * @author yingying.fan
	 * @version 2017年4月28日 下午3:16:05
	 * @param place
	 */
	private void go(Place place) {
		XGinjector.INSTANCE.getEventBus().fireEvent(new ModuleLoadEvent(place));
	}

	/**
	 * 清除缓存
	 * 
	 * @author yingying.fan
	 * @version 2017年4月28日 下午3:16:18
	 */
	private void clearCache() {
		XGinjector.INSTANCE.getIuiPlugin().showConfirmDialog("提示", "确定要清除缓存?", new ConfirmDialogCallBack() {
			@Override
			public void ok() {
				XGinjector.INSTANCE.getICache().clearH5Cache();
				LGinjector.INSTANCE.getUserBean().updateToCache();
				XGinjector.INSTANCE.getISystem().cleanCache(new PluginDefaultHandler() {

					@Override
					public void onPluginInvokeSuccess(String jsonStr) {
						XGinjector.INSTANCE.getEventBus().fireEvent(new ToastEvent(TOAST_LEVEL.INFO, "清除缓存成功", null));

					}

					@Override
					public void onPluginInvokeFailure(String jsonStr) {

					}
				});

			}

			@Override
			public void cancel() {

			}
		});

	}

	/**
	 * 根据登录状态及是否设置了密码来决定入口
	 * 
	 * @author tao.xie
	 * @version 2017年6月30日 下午2:51:43
	 * @param hasLogin
	 * @param issetPwd
	 */
	public void init(boolean hasLogin, boolean issetPwd) {
		this.clear();
//		addEntry("关于我们", SETTINGS_ENTER.ABOUT_US);
//		if (hasLogin) {
//			addEntry("问题反馈", SETTINGS_ENTER.FEED_BACK);
//			if (issetPwd)
//				addEntry("修改登录密码", SETTINGS_ENTER.MODIFY_LOGIN_PWD);
//			else
//				addEntry("设置登录密码", SETTINGS_ENTER.SETTING_LOGIN_PWD);
//
//		}
		addEntry("修改登录密码", SETTINGS_ENTER.MODIFY_LOGIN_PWD);
		addEntry("清除缓存", SETTINGS_ENTER.CLEAR_CACHE);
		cell.clearBorder();
	}
}
