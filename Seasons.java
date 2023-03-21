import java.util.HashMap;
import java.util.Map;

public class Seasons {

	public static void main(String[] args) {
		Map<String, String> SeasonsMap = new HashMap<>();
		SeasonsMap.put("春", "桜が咲く季節です。旬の果物はイチゴです。");
		SeasonsMap.put("夏", "向日葵が咲く季節です。旬の果物はスイカです。");
		SeasonsMap.put("秋", "コスモスが咲く季節です。旬の果物は柿です。");
		SeasonsMap.put("冬", "椿が咲く季節です。旬の果物はみかんです。");

		System.out.println(SeasonsMap.get("春"));
		System.out.println(SeasonsMap.get("夏"));
		System.out.println(SeasonsMap.get("秋"));
		System.out.println(SeasonsMap.get("冬"));
	}
}