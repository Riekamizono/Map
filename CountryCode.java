import java.util.HashMap;
import java.util.Map;

public class CountryCode {
	public static Map<Integer, String> countryCode = new HashMap<>() {
		{
			put(81, "日本");
			put(64, "ニュージーランド");
			put(34, "スペイン");
			put(41, "スイス連邦");
			put(27, "南アフリカ共和国");
			put(91, "インド");
			put(60, "マレーシア");
		}
	};

	public static void main(String[] args) {
		try {
			System.out.println(findCountryCode(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String findCountryCode(int code) throws Exception {
		String countryName = countryCode.get(code);
		if (countryName == null) {
			throw new Exception("no country found. code: " + code);
		}
		return countryName;
	}
}