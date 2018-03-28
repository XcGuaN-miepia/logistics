package cn.zzt.graduation.logistics.client.util;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONString;

import cn.easysw.mobileframework.client.framework.ISessionBean;
import cn.easysw.mobileframework.client.framework.XGinjector;
import cn.easysw.mobileframework.client.plugin.cache.ICache;
import cn.easysw.mobileframework.client.plugin.cache.ICacheCallBack;

/**
 * 用户Bean,页面初始化完成从Cache中读取并解析完成后,放在内存中
 * 
 * @author zhangtao.zhou
 * @version 2018年3月19日上午11:58:57
 */
public class UserBean implements ISessionBean {

	// 放入Cache中的key的值
	public static String USER_BEAN_KEY = "USERBEAN";
	// 登录的手机号
	public static final String USER_TEL_NO_KEY = "fdaheoibhdio3bcoabfcil";

	private String isLogin = "";// 记录用户是否登录,1已经登陆
	private String nickName = "";// 用户昵称
	private String sex = "";// 用户性别,1 男,2 女
	private String addr = "";// 用户的地址
	private String icon = "";// 用户头像
	private String birthday = "";// 用户生日
	private String phoneNo = "";// 用户手机号码
	private String session = "";// 用户session
	private ICache iCache = XGinjector.INSTANCE.getICache();
	@Override
	public void flush(final FlushCallBack callBack) {
		iCache.getPermanentCache(USER_BEAN_KEY, new ICacheCallBack() {

			@Override
			public void onSuccess(String cache) {
				XGinjector.INSTANCE.getILog().logMsg(
						UserBean.this.getClass().getSimpleName(),
						"FLUSH=>" + cache);
				if (cache != null && !cache.isEmpty()) {
					JSONObject jo = JSONParser.parseStrict(cache).isObject();
					parse(jo);
				} else {
					isLogin = "";
					nickName = "";
					sex = "";
					addr = "";
					icon = "";
					birthday = "";
					phoneNo = "";
					session = "";
				}
				if (callBack != null)
					callBack.onSuccess();
			}
		});
	}

	public String getAddr() {
		return addr;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getIcon() {
		return icon;
	}

	public String getIsLogin() {
		return isLogin;
	}

	public String getNickName() {
		return nickName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getSex() {
		return sex;
	}

	public String getSession() {
		return session;
	}

	public boolean hasLogin() {
		return this.isLogin.equals("1");
	}

	/**
	 * 解析数据
	 *
	 * @author zhangtao.zhou
	 * @version 2018年3月27日下午2:27:53
	 * @param jo
	 */
	public void parse(JSONObject jo) {
		if (jo.get("IS_LOGIN") != null) {
			if (jo.get("IS_LOGIN").isNumber() != null)
				UserBean.this.isLogin = jo.get("IS_LOGIN").isNumber()
						.doubleValue() == 1 ? "1" : "";
			else
				UserBean.this.isLogin = jo.get("IS_LOGIN").isString()
						.stringValue();
		}
		if (jo.get("NICK_NAME") != null)
			UserBean.this.nickName = jo.get("NICK_NAME").isString()
					.stringValue();
		if (jo.get("SEX") != null) {
			if (jo.get("SEX").isNumber() != null)
				UserBean.this.sex = jo.get("SEX").isNumber().doubleValue() == 2.0 ? "2"
						: "1";
			else {
				UserBean.this.sex = jo.get("SEX").isString().stringValue();
			}
		}
		if (jo.get("ADDR") != null)
			UserBean.this.addr = jo.get("ADDR").isString().stringValue();
		if (jo.get("ICON") != null)
			UserBean.this.icon = jo.get("ICON").isString().stringValue();
		if (jo.get("BIRTHDAY") != null)
			UserBean.this.birthday = jo.get("BIRTHDAY").isString()
					.stringValue();
		if (jo.get("PHONE") != null)
			UserBean.this.phoneNo = jo.get("PHONE").isString().stringValue();
		if (jo.get("SESSION") != null)
			UserBean.this.session = jo.get("SESSION").isString().stringValue();
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		iCache.setPermanentCache(USER_TEL_NO_KEY, phoneNo);
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setSession(String session) {
		this.session = session;
	}

	@Override
	public void updateToCache() {
		JSONObject jo = new JSONObject();
		jo.put("IS_LOGIN", new JSONString(this.isLogin));
		jo.put("NICK_NAME", new JSONString(this.nickName));
		jo.put("SEX", new JSONString(this.sex));
		jo.put("ADDR", new JSONString(this.addr));
		jo.put("ICON", new JSONString(this.icon));
		jo.put("BIRTHDAY", new JSONString(this.birthday));
		jo.put("PHONE", new JSONString(this.phoneNo));

		iCache.setPermanentCache(USER_BEAN_KEY, jo.toString());
		
		iCache.setPermanentCache("USER_BEAN_SESSION", session);

	}

	@Override
	public void clear() {
		this.isLogin = "";
		this.nickName = "";
		this.sex = "";
		this.addr = "";
		this.icon = "";
		this.birthday = "";
		this.phoneNo = "";
	}

}
