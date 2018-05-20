package cn.zzt.graduation.logistics.client.place;

import cn.easysw.mobileframework.client.mvp.ActivityCallbackHandler;
import cn.easysw.mobileframework.client.mvp.ActivityPlace;
import cn.easysw.mobileframework.client.mvp.place.AppModule;
import cn.easysw.mobileframework.client.mvp.place.RefreshVisible;
import cn.xiaobu.web.citybeauty.client.framework.INeedLoginPlace;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 订单列表-place
 * 
 * @author yingying.fan
 * @version 2017年4月22日下午2:42:07
 */
public class OrderListPlace extends ActivityPlace implements INeedLoginPlace {

	@AppModule("module=shop-app&page=orderlist")
	@Prefix("orderlist")
	@RefreshVisible
	public static class Tokenizer implements PlaceTokenizer<OrderListPlace> {

		private final Provider<OrderListPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<OrderListPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}

		@Override
		public OrderListPlace getPlace(String token) {
			OrderListPlace place = placeProvider.get();
			return place;
		}

		@Override
		public String getToken(OrderListPlace place) {
			return "";
		}

	}
}
