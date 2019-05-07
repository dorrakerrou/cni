package application.util;

public enum RoleEnum {

	ROLE_ORD("ROLE_ORD"),
	ROLE_CONTROL("ROLE_CONTROL"),
	ROLE_PAYEUR("ROLE_PAYEUR"),
	ROLE_MINSTR("ROLE_MINSTR"),
	ROLE_USER("ROLE_USER"),
	ROLE_ADMIN("ROLE_ADMIN");
	
	private String name;
	
	RoleEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
