package Date_18_4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab1 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Chữ Đẹp Trai", 28);
        hashMap.put("Thần Tiên Tỷ Tỷ", 23);
        hashMap.put("Tiểu Long Nữ", 26);
        hashMap.put("Tôn Ngộ Không", 44);
        hashMap.put("Địch Lệ Liệt Ba", 15);
        System.out.println("Hiển thị với HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển Thị");
        System.out.println(treeMap);


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Chữ Đẹp Trai", 28);
        linkedHashMap.put("Thần Tiên Tỷ Tỷ", 23);
        linkedHashMap.put("Tiểu Long Nữ", 26);
        linkedHashMap.put("Tôn Ngộ Không", 44);
        linkedHashMap.put("Địch Lệ Liệt Ba", 15);
        System.out.println("Thần Tiên Tỷ Tỷ là     " + linkedHashMap.get("Thần Tiên Tỷ Tỷ")+ "Tuổi");

    }
}
