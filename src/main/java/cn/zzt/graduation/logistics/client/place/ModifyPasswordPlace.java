package cn.zzt.graduation.logistics.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.inject.Inject;
import com.google.inject.Provider;

import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;

/**
 * 修改密码地址
 * 
 * @author zhangtao.zhou
 * @version 2018年4月3日下午3:12:22
 */
public class ModifyPasswordPlace extends ActivityPlace{
	@AppModule("module=app&page=modifypassword")
	@Prefix("modifypassword")
	public static class Tokenizer implements PlaceTokenizer<ModifyPasswordPlace>{
		
		private Provider<ModifyPasswordPlace> placeProvider;
		
		@Inject
		public Tokenizer(Provider<ModifyPasswordPlace> placeProvider){
			this.placeProvider=placeProvider;
		}

		@Override
		public ModifyPasswordPlace getPlace(String token) {
			ModifyPasswordPlace modifyPasswordPlace=placeProvider.get();
			return modifyPasswordPlace;
		}

		@Override
		public String getToken(ModifyPasswordPlace place) {
			return "";
		}
		
	}
}
