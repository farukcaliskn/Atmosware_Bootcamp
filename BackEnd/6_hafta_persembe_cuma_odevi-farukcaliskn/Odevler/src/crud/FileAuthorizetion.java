package crud;

public enum FileAuthorizetion {
	ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");

	private final int key;
	private final String value;

	// constructur final olmalıdır
	private FileAuthorizetion(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

}
