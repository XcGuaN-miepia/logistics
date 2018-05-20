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
 * 待收货订单列表-place
 * 
 * @author yingying.fan
 * @version 2017年4月22日下午2:42:07
 */
public class OrderReceiptListPlace extends ActivityPlace implements INeedLoginPlace {

	@AppModule("module=shop-app&page=orderlist&select=3&_sel=3")
	@Prefix("orderreceiptlist")
	@RefreshVisible
	public static class Tokenizer implements PlaceTokenizer<OrderReceiptListPlace> {

		private final Provider<OrderReceiptListPlace> placeProvider;

		@Inject
		public Tokenizer(Provider<OrderReceiptListPlace> placeProvider) {
			this.placeProvider = placeProvider;
		}

		@Override
		public OrderReceiptListPlace getPlace(String token) {
			OrderReceiptListPlace place = placeProvider.get();
			return place;
		}

		@Override
		public String getToken(OrderReceiptListPlace place) {
			return "";
		}

	}
}
