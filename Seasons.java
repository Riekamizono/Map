import java.util.HashMap;
import java.util.Map;

public class Seasons {

	public static void main(String[] args) {
		Map<String, String> seasonsMap = new HashMap<>();
		seasonsMap.put("春", "桜が咲く季節です。旬の果物はイチゴです。");
		seasonsMap.put("夏", "向日葵が咲く季節です。旬の果物はスイカです。");
		seasonsMap.put("秋", "コスモスが咲く季節です。旬の果物は柿です。");
		seasonsMap.put("冬", "椿が咲く季節です。旬の果物はみかんです。");

		System.out.println(seasonsMap.get("春"));
		System.out.println(seasonsMap.get("夏"));
		System.out.println(seasonsMap.get("秋"));
		System.out.println(seasonsMap.get("冬"));
	}
}