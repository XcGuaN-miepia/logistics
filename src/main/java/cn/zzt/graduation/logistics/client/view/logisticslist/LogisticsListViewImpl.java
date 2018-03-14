package cn.zzt.graduation.logistics.client.view.logisticslist;

import cn.easysw.mobileframework.client.framework.IViewPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

/**
 * 类说明
 * 
 * @author zhangtao.zhou
 * @version 2018年3月14日上午11:20:03
 */
public class LogisticsListViewImpl extends Composite implements LogisticsListView{

	private static LogisticsListViewImplUiBinder uiBinder = GWT
			.create(LogisticsListViewImplUiBinder.class);

	interface LogisticsListViewImplUiBinder extends
			UiBinder<Widget, LogisticsListViewImpl> {
	}

	public LogisticsListViewImpl() {
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

}

