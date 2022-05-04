package first.common.util;

import java.util.UUID;

public class CommonUtils {
	public static String getRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
// UUID (Universally Unique Identifiers)
// 각 개체를 고유하게 식별 가능한 값