package cn.zzt.graduation.logistics.client.mvp;

import cn.zzt.graduation.logistics.client.place.MyPlace;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * MVP结构中Place绑定声明类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月26日下午2:52:10
 */
public class PlaceFactory {
	@Inject
	MyPlace.Tokenizer myTokenizer;

	@Inject
	Provider<MyPlace> myProvider;

	public MyPlace getMyPlace() {
		return myProvider.get();
	}

	public MyPlace.Tokenizer getMyPlaceTokenizer() {
		return myTokenizer;
	}
}

