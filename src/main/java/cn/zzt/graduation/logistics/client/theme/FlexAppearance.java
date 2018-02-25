package cn.zzt.graduation.logistics.client.theme;

import com.google.gwt.resources.client.CssResource;

/**
 * FLEX样式兼容CSS接口
 * 
 * @author zhangtao.zhou
 * @version 2018年1月18日 下午2:09:48
 */
public interface FlexAppearance {
	interface FlexCss extends CssResource {
		@ClassName("flex1")
		String flex1();

		@ClassName("flex-h")
		String flexH();

		@ClassName("flex-hs")
		String flexHS();

		@ClassName("flex-hc")
		String flexHC();

		@ClassName("flex-he")
		String flexHE();

		@ClassName("flex-hr")
		String flexHR();

		@ClassName("flex-hsb")
		String flexHSB();

		@ClassName("flex-hw")
		String flexHW();

		@ClassName("flex-v")
		String flexV();

		@ClassName("flex-vs")
		String flexVS();

		@ClassName("flex-vc")
		String flexVC();

		@ClassName("flex-ve")
		String flexVE();

		@ClassName("flex-vw")
		String flexVW();

		@ClassName("flex-vb")
		String flexVB();
	}

	FlexCss css();
}
