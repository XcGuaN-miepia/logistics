package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

/**
 * 我的页面地址
 * 
 * @author zhangtao.zhou
 * @version 2018年3月26日下午2:54:55
 */
public class MyPlace extends ActivityPlace{
	@AppModule("module=app&page=my")
	@Prefix("my")
//	@RefreshVisible
//	@ToolBarInvisible
	public static class Tokenizer implements PlaceTokenizer<MyPlace> {

		private final Provider<MyPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<MyPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}


		@Override
		public MyPlace getPlace(String token) {
			MyPlace myPlace=placeProvider.get();
			return myPlace;
		}

		@Override
		public String getToken(MyPlace place) {
			return "";
		}

	}

}

