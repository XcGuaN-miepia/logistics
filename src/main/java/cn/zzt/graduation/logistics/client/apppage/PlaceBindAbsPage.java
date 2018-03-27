package cn.zzt.graduation.logistics.client.apppage;

import cn.xiaobu.web.citybeauty.client.framework.OKCityAbsPageV2;
import cn.zzt.graduation.logistics.client.gin.LGinjector;
import cn.zzt.graduation.logistics.client.mvp.PlaceFactory;

/**
 * APP抽象页面.此页面用于初始化绑定place
 * 
 * @author zhangtao.zhou
 * @version 2018年3月27日上午9:08:39
 */
public abstract class PlaceBindAbsPage extends OKCityAbsPageV2{

	@Override
	public String getPageBgColor() {
		return GRAY_BGCOLOR;
	}

	@Override
	public void init() {
		final PlaceFactory factory = LGinjector.INSTANCE.getPlaceFactory();
	}

	
}

