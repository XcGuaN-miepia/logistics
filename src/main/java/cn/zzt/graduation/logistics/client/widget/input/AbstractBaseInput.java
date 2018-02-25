package cn.zzt.graduation.logistics.client.widget.input;


import cn.zzt.graduation.logistics.client.widget.button2.CloseButton;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**  
 * 抽象的输入框
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午4:32:40
 */
public abstract class AbstractBaseInput extends Composite implements IValueInput,IValidInput{

	private static AbstractBaseInputUiBinder uiBinder = GWT
			.create(AbstractBaseInputUiBinder.class);

	interface AbstractBaseInputUiBinder extends
			UiBinder<Widget, AbstractBaseInput> {
	}
	
	@UiField
	FlowPanel panel;
	@UiField
	Image image;
	@UiField
	TextBox input;
	@UiField
	CloseButton deletebtn;
	
	@UiHandler("input")
	void addInputKeyUpHandler(KeyUpEvent event){
		showOrHideCloseBtn();
	}
	
	@UiHandler("deletebtn")
	void addDeleteClickHandler(ClickEvent event){
		resetInput();
		input.setFocus(true);
	}

	public AbstractBaseInput() {
		initWidget(uiBinder.createAndBindUi(this));
		showOrHideCloseBtn();
	}
	
	/**
	 * 设置输入框类型
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午6:02:42 
	 * @param type
	 */
	public void setType(String type){
		input.getElement().setAttribute("type", type);
	}
	
	/**
	 * 设置输入框提示
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午6:03:57 
	 * @param placeHolder
	 */
	public void setPlaceHolder(String placeHolder){
		input.getElement().setAttribute("placeHolder", placeHolder);
	}
	
	@Override
	public String getValue() {
		return input.getValue().trim();
	}

	@Override
	public void setValue(String value) {
		input.setValue(value);
		showOrHideCloseBtn();
	}

	/**
	 * 输入框有值显示删除键，没有值去除隐藏删除键
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午5:43:13 
	 */
	void showOrHideCloseBtn(){
		deletebtn.setVisible(!getValue().isEmpty());
	}

	/**
	 * 重置输入框
	 * 
	 * @author zhangtao.zhou
	 * @version 2018年1月18日 下午5:44:08 
	 */
	void resetInput(){
		setValue("");
	}
	


}
