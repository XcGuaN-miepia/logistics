package cn.zzt.graduation.logistics.client.place;

import cn.easysw.mobileframework.client.mvp.ActivityCallbackHandler;
import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;
import cn.xiaobu.web.citybeauty.client.framework.INeedLoginPlace;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 订单详情-place
 * 
 * @author yingying.fan
 * @version 2017年4月22日下午2:41:48
 */
public class OrderDetailPlace extends ActivityPlace implements INeedLoginPlace {

	@AppModule("module=shop-app&page=orderdetail")
	@Prefix("orderdetail")
	public static class Tokenizer implements PlaceTokenizer<OrderDetailPlace> {

		private final Provider<OrderDetailPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<OrderDetailPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}

		@Override
		public OrderDetailPlace getPlace(String token) {
			OrderDetailPlace place = placeProvider.get();
			return place;
		}

		@Override
		public String getToken(OrderDetailPlace place) {
			return "";
		}

	}
}
