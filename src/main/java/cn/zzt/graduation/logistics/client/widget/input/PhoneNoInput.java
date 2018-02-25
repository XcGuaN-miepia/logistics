package cn.zzt.graduation.logistics.client.widget.input;

import cn.zzt.graduation.logistics.client.gin.LGinjector;

import com.google.gwt.user.client.Window;


/**  
 * 手机号码输入框
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午5:55:49
 */
public class PhoneNoInput extends AbstractBaseInput{
	private final String PHONE_REG = "^((13[0-9])|(14[0-9])|(17[0-9])|(15[0-9])|(18[0-9]))\\d{8}$";

	
	public PhoneNoInput(){
		super();
		image.setUrl("images/login/Mobile-phone.png");
		setType("tel");
		setPlaceHolder(LGinjector.INSTANCE.getLMessages().PhoneNoInputPlaceHolder());
//		setPlaceHolder("请输入手机号码");
		
	}
	@Override
	public boolean valid() {
		if(input.getValue().isEmpty()){
			Window.alert(LGinjector.INSTANCE.getLMessages().PhoneNoInputPlaceHolder());
			return false;
		}else if(!input.getValue().matches(PHONE_REG)){
			Window.alert(LGinjector.INSTANCE.getLMessages().PhoneNoLengthError());
			return false;
		}
		return true;
	}

}
