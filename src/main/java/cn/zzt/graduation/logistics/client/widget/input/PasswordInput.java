package cn.zzt.graduation.logistics.client.widget.input;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;

import cn.easysw.mobileframework.client.framework.XGinjector;
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
	
	public void setEyeVisible(boolean isVisible){
		eye.setVisible(isVisible);
	}
	
	public PasswordInput() {
		super();
		image.setUrl("images/login/password.png");
		setType("password");
		setPlaceHolder(LGinjector.INSTANCE.getLMessages().pwdInputPlaceHolder());
		
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
//			Window.alert(LGinjector.INSTANCE.getLMessages().pwdInputPlaceHolder());
			XGinjector.INSTANCE.getToast().show(LGinjector.INSTANCE.getLMessages().pwdInputPlaceHolder(), null);
			return false;
		}else if(input.getValue().indexOf(" ")>-1){
			XGinjector.INSTANCE.getToast().show(LGinjector.INSTANCE.getLMessages().pwdCanNotBlank(), null);
			return false;
		}
		return true;
	}

}
