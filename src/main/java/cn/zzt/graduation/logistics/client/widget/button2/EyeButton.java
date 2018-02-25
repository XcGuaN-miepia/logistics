package cn.zzt.graduation.logistics.client.widget.button2;

import com.google.gwt.user.client.ui.Image;

/**  
 * 眼睛图标
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月22日  上午10:50:12
 */
public class EyeButton extends Image{
	
	public EyeButton(){
		this.setSize("0.8rem", "0.8rem");
		this.setUrl("images/login/eye_false.png");
	}
	
	public void setTextVisible(boolean visible){
		this.setUrl("images/login/eye_"+visible+".png");
	}
}
