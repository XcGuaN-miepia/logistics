package cn.zzt.graduation.logistics.client.widget.titlebar;

import cn.zzt.graduation.logistics.client.widget.button.BackIcon;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

/**  
 * 页面顶端标题
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月22日  下午3:04:59
 */
public class TitleBar extends Composite{

	private static TitleBarUiBinder uiBinder = GWT
			.create(TitleBarUiBinder.class);

	interface TitleBarUiBinder extends UiBinder<Widget, TitleBar> {
	}
	
	@UiField
	BackIcon backbtn;
	@UiField
	HTML titlehtml,rightbtn;
	

	public TitleBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setRightText(String text){
		rightbtn.setText(text);
	}
	
	public void setTitleText(String text){
		titlehtml.setText(text);
	}
}
