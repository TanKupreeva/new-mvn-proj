package dz.collection.map;

import dz.streams_tasks.BufferedCharacterStream;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        SortedSet<String> set = new TreeSet<>();
        String str = BufferedCharacterStream.read("/Users/tatyanakupreeva/Documents/io_tests/колобокRu.txt").toLowerCase();
        Pattern p = Pattern.compile("[а-я]+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            set.add(m.group());
        }
        System.out.println(set);

        for (String s : set) {
            int counter = 0;
            Pattern pa = Pattern.compile(s);
            Matcher ma = pa.matcher(str);
            while (ma.find()) counter++;
            map.put(s, counter);
        }
        map.forEach((k,v)-> System.out.println( k + " : " + v));
        
    }
}
