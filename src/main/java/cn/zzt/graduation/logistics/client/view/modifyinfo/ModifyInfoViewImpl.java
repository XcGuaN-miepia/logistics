package cn.zzt.graduation.logistics.client.view.modifyinfo;

import java.util.ArrayList;
import java.util.List;

import cn.easysw.mobileframework.client.framework.IViewPresenter;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.plugin2.PluginDefaultHandler;
import cn.easysw.mobileframework.client.plugin2.ui.LabelBean;

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
import com.google.gwt.user.client.ui.Widget;

public class ModifyInfoViewImpl extends Composite implements ModifyInfoView {

	private static ModifyInfoViewImplUiBinder uiBinder = GWT
			.create(ModifyInfoViewImplUiBinder.class);

	interface ModifyInfoViewImplUiBinder extends
			UiBinder<Widget, ModifyInfoViewImpl> {
	}
	
	@UiField
	HTML datepicker,sexpicker;
	
	public ModifyInfoViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
		sexpicker.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				List<LabelBean> labels = new ArrayList<LabelBean>();
				LabelBean labelBean = new LabelBean("1", "男");
				LabelBean labelBean2 = new LabelBean("2", "女");
				labels.add(labelBean);
				labels.add(labelBean2);

				XGinjector.INSTANCE.getIuiPlugin().showActionSheet(new PluginDefaultHandler() {

					@Override
					public void onPluginInvokeSuccess(String jsonStr) {
						int sex = Integer.parseInt(jsonStr);
						datepicker.setText(sex == 1 ? "男" : "女");
					}

					@Override
					public void onPluginInvokeFailure(String jsonStr) {

					}
				}, "请选择性别", labels);				
			}
		});
		datepicker.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
			}
		});
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
