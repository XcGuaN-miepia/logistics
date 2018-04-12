package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

/**
 * 设置地址
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午3:12:22
 */
public class SettingPlace extends ActivityPlace{
	@AppModule("module=app&page=setting")
	@Prefix("setting")
	public static class Tokenizer implements PlaceTokenizer<SettingPlace>{
		
		private Provider<SettingPlace> placeProvider;
		
		@Inject
		public Tokenizer(Provider<SettingPlace> placeProvider){
			this.placeProvider=placeProvider;
		}

		@Override
		public SettingPlace getPlace(String token) {
			SettingPlace settingPlace=placeProvider.get();
			return settingPlace;
		}

		@Override
		public String getToken(SettingPlace place) {
			return "";
		}
		
	}
}
