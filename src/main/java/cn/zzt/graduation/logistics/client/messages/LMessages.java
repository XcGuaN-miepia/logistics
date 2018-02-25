package cn.zzt.graduation.logistics.client.messages;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.i18n.client.Messages;

/**  
 * 信息接口
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月19日  上午9:20:28
 */
public interface LMessages extends Messages{
	public static final LMessages INSTANCE=GWT.create(LMessages.class);
	
	//登录模块提示
	@DefaultMessage("请输入手机号码")
	String PhoneNoInputPlaceHolder();
	
	@DefaultMessage("手机号码格式错误")
	String PhoneNoLengthError();

	@DefaultMessage("请输入密码")
	String PwdInputPlaceHolder();
	
	@DefaultMessage("密码不能包含空格")
	String PwdCanNotBlank();

}
