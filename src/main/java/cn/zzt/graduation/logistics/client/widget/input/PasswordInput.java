package cn.zzt.graduation.logistics.client.widget.input;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;

import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.widget.button2.EyeButton;

/**  
 * 密码输入框
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月22日  上午10:48:45
 */
public class PasswordInput extends AbstractBaseInput{
	private EyeButton eye=new EyeButton();
	private boolean canSeePWD=false;
	
//	@UiHandler("eye")
//	void addEyeClickEvent(ClickEvent event){
//		canSeePWD=!canSeePWD;
//		setType(canSeePWD?"text":"password");
//		eye.setTextVisible(canSeePWD);
//	}
	
	public void setEyeVisible(boolean isVisible){
		eye.setVisible(isVisible);
	}
	
	public PasswordInput() {
		super();
		image.setUrl("images/login/password.png");
		setType("password");
		setPlaceHolder(LGinjector.INSTANCE.getLMessages().PwdInputPlaceHolder());
		
		setEyeVisible(false);
		eye.getElement().getStyle().setProperty("marginLeft", "0.133rem");
		eye.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				canSeePWD=!canSeePWD;
				setType(canSeePWD?"text":"password");
				eye.setTextVisible(canSeePWD);
			}
		});

		panel.add(eye);
	}
	
	@Override
	public boolean valid() {
		if(input.getValue().isEmpty()){
			Window.alert(LGinjector.INSTANCE.getLMessages().PwdInputPlaceHolder());
			return false;
		}else if(input.getValue().indexOf(" ")>-1){
			Window.alert(LGinjector.INSTANCE.getLMessages().PwdCanNotBlank());
			return false;
		}
		return true;
	}

}
