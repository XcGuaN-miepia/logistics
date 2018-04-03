package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

/**
 * 关于我们地址
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午3:12:22
 */
public class AboutUsPlace extends ActivityPlace{
	@AppModule("module=app&page=aboutus")
	@Prefix("aboutus")
	public static class Tokenizer implements PlaceTokenizer<AboutUsPlace>{
		
		private Provider<AboutUsPlace> placeProvider;
		
		@Inject
		public Tokenizer(Provider<AboutUsPlace> placeProvider){
			this.placeProvider=placeProvider;
		}

		@Override
		public AboutUsPlace getPlace(String token) {
			AboutUsPlace aboutusPlace=placeProvider.get();
			return aboutusPlace;
		}

		@Override
		public String getToken(AboutUsPlace place) {
			return "";
		}
		
	}
}
