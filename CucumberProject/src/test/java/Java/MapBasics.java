package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasics {
	public static void main(String[] args) {

		Map<Object, Object> map1 = new HashMap<>();
		map1.put("Joseph1", 1);
		map1.put("Sandra1", 2);
		map1.put("Danish1", 3);

		System.out.println(map1);
		System.out.println(map1.get("Sandra"));

		Map<Object, Object> map2 = new HashMap<>();
		map2.put("Joseph2", 11);
		map2.put("Sandra2", 12);
		map2.put("Danish2", 13);

		Map<Object, Object> map3 = new HashMap<>();
		map3.put("Joseph3", 21);
		map3.put("Sandra3", 22);
		map3.put("Danish3", 23);

		Map<Object, Object> map4 = new HashMap<>();
		map4.put("Joseph4", 31);
		map4.put("Sandra4", 32);
		map4.put("Danish4", 33);

		List<Map<Object, Object>> BigList = new ArrayList<>();
		BigList.add(map1);
		BigList.add(map2);
		BigList.add(map3);
		BigList.add(map4);

		System.out.println(BigList); // [{Sandra1=2, Joseph1=1, Danish1=3}, {Sandra2=12, Joseph2=11, Danish2=13},
										// {Sandra3=22, Danish3=23, Joseph3=21},
										// {Sandra4=32, Danish4=33, Joseph4=31}]
		System.out.println(BigList.get(2).get("Sandra3"));

	}

}
