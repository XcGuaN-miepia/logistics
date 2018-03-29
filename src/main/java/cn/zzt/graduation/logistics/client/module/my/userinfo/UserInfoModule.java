package cn.zzt.graduation.logistics.client.module.my.userinfo;

import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.framework.event.ModuleLoadEvent;
import cn.easysw.mobileframework.client.plugin.camera.CameraCallBack;
import cn.easysw.mobileframework.client.plugin2.system.PhotoPluginHandler;
import cn.easysw.mobileframework.client.util.StringUtils;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.util.UserBean;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

/**
 * 我的页面头部用户信息
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日上午9:51:29
 */
public class UserInfoModule extends Composite {

	private static UserInfoModuleUiBinder uiBinder = GWT
			.create(UserInfoModuleUiBinder.class);

	private boolean isLogin = false;
	UserBean userBean = LGinjector.INSTANCE.getUserBean();

	interface UserInfoModuleUiBinder extends UiBinder<Widget, UserInfoModule> {
	}

	@UiField
	FlowPanel mainfp;
	@UiField
	HTML namehtml, phonehtml;
	@UiField
	Image headimg;

	public UserInfoModule() {
		initWidget(uiBinder.createAndBindUi(this));

		mainfp.addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				pushToLoginOrEditPage();
			}
		}, ClickEvent.getType());

//		headimg.addClickHandler(new ClickHandler() {
//
//			@Override
//			public void onClick(ClickEvent event) {
//				XGinjector.INSTANCE.getISystem().photoPicker(1,
//						new PhotoPluginHandler() {
//
//							@Override
//							public void onBizFailure() {
//								// TODO Auto-generated method stub
//
//							}
//
//							@Override
//							public void onPhotoSuccess(String[] imgUrls) {
//								userBean.setIcon(String.valueOf(imgUrls));
//								userBean.updateToCache();
//								headimg.setUrl(userBean.getIcon());
//							}
//						});
//			}
//		});
	}

	protected void pushToLoginOrEditPage() {
		if (isLogin) {
			// XGinjector.INSTANCE.getEventBus().fireEvent();
		} else {
			XGinjector.INSTANCE.getEventBus().fireEvent(
					new ModuleLoadEvent(LGinjector.INSTANCE.getPlaceFactory()
							.getLoginPlace()));
		}
	}

	/**
	 * 更改名字
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 上午9:32:41
	 * @param name
	 */
	public void setNameHtml(String name) {
		namehtml.setText(name);
	}

	/**
	 * 更改手机号
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年3月29日 上午9:32:57
	 * @param phone
	 */
	public void setPhoneHtml(String phone) {
		phonehtml.setText(phone);
	}

	/**
	 * 置入数据
	 *
	 * @author zhangtao.zhou
	 * @version 2018年3月19日上午11:29:35
	 */
	public void setData() {
		if (userBean.hasLogin()) {
			isLogin = true;
			phonehtml.setText(StringUtils.hideStrByStar(userBean.getPhoneNo(),
					3, 4));
			if (!userBean.getIcon().isEmpty())
				headimg.setUrl(userBean.getIcon());
			else
				headimg.setUrl("images/my/head_def.png");

			if (userBean.getNickName().isEmpty()) {
				namehtml.setText(StringUtils.hideStrByStar(
						userBean.getPhoneNo(), 3, 4));
			} else {
				namehtml.setText(userBean.getNickName());
			}
		} else {
			isLogin = false;
			namehtml.setText("请登录");
			headimg.setUrl("images/my/head_def.png");
		}
	}
}
