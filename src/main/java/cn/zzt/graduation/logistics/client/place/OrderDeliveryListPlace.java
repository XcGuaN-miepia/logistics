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
 * 待发货订单列表-place
 * 
 * @author yingying.fan
 * @version 2017年4月22日下午2:42:07
 */
public class OrderDeliveryListPlace extends ActivityPlace implements INeedLoginPlace {

	@AppModule("module=shop-app&page=orderlist&select=2&_sel=2")
	@Prefix("orderdeliverylist")
	@RefreshVisible
	public static class Tokenizer implements PlaceTokenizer<OrderDeliveryListPlace> {

		private final Provider<OrderDeliveryListPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<OrderDeliveryListPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}

		@Override
		public OrderDeliveryListPlace getPlace(String token) {
			OrderDeliveryListPlace place = placeProvider.get();
			return place;
		}

		@Override
		public String getToken(OrderDeliveryListPlace place) {
			return "";
		}

	}
}
