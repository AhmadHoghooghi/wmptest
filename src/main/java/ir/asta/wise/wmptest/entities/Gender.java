package ir.asta.wise.wmptest.entities;

import ir.asta.wise.core.util.locale.LocaleUtil;

public enum Gender {
	MALE, FEMALE;
	private static String PROP_BUNDLE_KEY = "gender_";
	public String toString() {
		return LocaleUtil.getText(PROP_BUNDLE_KEY + this.name());
	}
}
