package donePackage;

public enum Gender {
	MALE("Male"), FEMALE("Female"), GENDER_EROPR("Error");
	private String val;

	private Gender(String s) {
		val = s;
	}

	public static Gender fromString(String s) {
		s = s.toUpperCase();
		if (s.startsWith("M"))
			return (MALE);
		if (s.startsWith("F"))
			return (FEMALE);
		return (GENDER_EROPR);
	}

	public String toString() {
		return (val);
	}
}
