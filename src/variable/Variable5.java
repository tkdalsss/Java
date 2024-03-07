package variable;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        // 역순으로 char를 대문자로 출력하시오

        /*
        char[] result = str.toUpperCase().toCharArray();
        for (int i = result.length-1; i >= 0; i--) {
            System.out.println(result[i]);
        }
        */

        List<Character> charList = new ArrayList<>(str.toUpperCase().chars().mapToObj((c) -> (char) c).toList());
        charList.sort(Collections.reverseOrder());
        String reverseStr = charList.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverseStr);

//        List<Character> list = new ArrayList<>();
//        for (char c : str.toUpperCase().toCharArray()) {
//            list.add(c);
//        }
//        list.sort(Collections.reverseOrder());
//
//        Iterator<Character> it = list.iterator();
//
//        while (it.hasNext()) {
//            System.out.print(it.next());
//        }

    }
}
