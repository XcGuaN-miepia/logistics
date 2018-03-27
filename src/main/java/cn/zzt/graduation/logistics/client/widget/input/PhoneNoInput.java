package cn.zzt.graduation.logistics.client.widget.input;

import cn.easysw.mobileframework.client.framework.XGinjector;
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
		setPlaceHolder(LGinjector.INSTANCE.getLMessages().phoneNoInputPlaceHolder());
	}
	@Override
	public boolean valid() {
		if(input.getValue().isEmpty()){
			XGinjector.INSTANCE.getToast().show(LGinjector.INSTANCE.getLMessages().phoneNoInputPlaceHolder(), null);
			return false;
		}else if(!input.getValue().matches(PHONE_REG)){
			XGinjector.INSTANCE.getToast().show(LGinjector.INSTANCE.getLMessages().phoneNoLengthError(), null);
			return false;
		}
		return true;
	}

}
