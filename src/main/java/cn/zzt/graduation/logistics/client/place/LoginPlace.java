package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

public class LoginPlace extends ActivityPlace{
	@AppModule("module=app&page=Login")
	@Prefix("login")
	public static class Tokenizer implements PlaceTokenizer<LoginPlace>{
		
		private Provider<LoginPlace> placeProvider;
		
		@Inject
		public Tokenizer(Provider<LoginPlace> placeProvider){
			this.placeProvider=placeProvider;
		}

		@Override
		public LoginPlace getPlace(String token) {
			LoginPlace loginPlace=placeProvider.get();
			return loginPlace;
		}

		@Override
		public String getToken(LoginPlace place) {
			return "";
		}
		
	}

}
