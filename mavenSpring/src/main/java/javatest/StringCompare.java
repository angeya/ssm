package javatest;

import java.util.ArrayList;
import java.util.List;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "王安杰";
        String str2 = new String("王安杰");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(System.identityHashCode(str1));
        str1 = str1 + "love 黄蝶蝶";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        List<StringCompare> integerList = new ArrayList<>();


        for (int i = 0; i < 100000;i++){
//            System.out.println(i);
            integerList.add(new StringCompare());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
