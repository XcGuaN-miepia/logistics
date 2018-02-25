package cn.zzt.graduation.logistics.client.theme;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;

public class FlexDefaultAppearance implements FlexAppearance {

	interface Resources extends ClientBundle {
		Resources INSTANCE = GWT.create(Resources.class);

		@Source({ "flex.css" })
		FlexCss css();

	}

	static {
		Resources.INSTANCE.css().ensureInjected();
	}

	@Override
	public FlexCss css() {
		return Resources.INSTANCE.css();
	}

}
