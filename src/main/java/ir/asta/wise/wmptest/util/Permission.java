package ir.asta.wise.wmptest.util;

public enum Permission {
	
	SAMPLE_PERMISSION("sample.code");
	
	private final String code;
	
	private Permission(String permissionCode) {
		this.code = permissionCode;
	}
	
	public String getCode() {
		return code;
	}

}
