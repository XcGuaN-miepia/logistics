package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

/**
 * 注册地址
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日上午11:22:43
 */
public class RegisterPlace extends ActivityPlace{
	@AppModule("module=app&page=register")
	@Prefix("register")
	public static class Tokenizer implements PlaceTokenizer<RegisterPlace> {

		private final Provider<RegisterPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<RegisterPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}


		@Override
		public RegisterPlace getPlace(String token) {
			RegisterPlace registerPlace=placeProvider.get();
			return registerPlace;
		}

		@Override
		public String getToken(RegisterPlace place) {
			return "";
		}
	}
}
