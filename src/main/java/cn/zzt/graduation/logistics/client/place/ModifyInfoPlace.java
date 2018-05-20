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
public class ModifyInfoPlace extends ActivityPlace{
	@AppModule("module=app&page=modifyinfo")
	@Prefix("modifyinfo")
	public static class Tokenizer implements PlaceTokenizer<ModifyInfoPlace>{
		
		private Provider<ModifyInfoPlace> placeProvider;
		
		@Inject
		public Tokenizer(Provider<ModifyInfoPlace> placeProvider){
			this.placeProvider=placeProvider;
		}

		@Override
		public ModifyInfoPlace getPlace(String token) {
			ModifyInfoPlace modifyInfoPlace=placeProvider.get();
			return modifyInfoPlace;
		}

		@Override
		public String getToken(ModifyInfoPlace place) {
			return "";
		}
		
	}
}
