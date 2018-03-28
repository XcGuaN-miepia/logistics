package cn.zzt.graduation.logistics.client.moduleload;

import cn.easysw.mobileframework.client.mvp.place.ModulePlaceMapper;
import cn.xiaobu.web.citybeauty.client.moduleload.NativeModuleAbstractLoader;
import cn.zzt.graduation.logistics.client.gin.LGinjector;

/**
 * Native模块跳转实现类
 * 
 * @author zhangtao.zhou
 * @version 2018年3月27日上午9:50:47
 */

public class NativeModuleLoaderImpl extends NativeModuleAbstractLoader {

	@Override
	public ModulePlaceMapper getPlaceMapper() {
		return LGinjector.INSTANCE.getHistoryMapper();
	}

}

