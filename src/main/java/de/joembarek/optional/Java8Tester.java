package de.joembarek.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Java8Tester {

    public static void main(String args[]) {
        Java8Tester java8Tester = new Java8Tester();
        Integer value1 = null;
        Map<String, Long> map_1 = null;

        Integer value2 = new Integer(10);
        Map<String, Long> map_2 = new HashMap<>();
        map_2.put("key_1", (long) 4);

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Map<String, Long>> mapOpt_1 = Optional.ofNullable(map_1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
        Optional<Map<String, Long>> mapOpt_2 = Optional.of(map_2);

        //System.out.println(java8Tester.sum(a, b));
        java8Tester.merge(mapOpt_1, mapOpt_2);
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }

    private void merge(Optional<Map<String, Long>> a, Optional<Map<String, Long>> b) {
        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Map<String, Long> value1 = a.orElse(new HashMap<String, Long>() {{
            put("a", (long) 40);
        }});

        System.out.println("First parameter is present: " + value1.get("a"));

        //Optional.get - gets the value, value should be present
        Map<String, Long> value2 = b.get();
    }
}