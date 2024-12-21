import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i;
        long big = 999999999999999999L;
        float f = 1.23456789f;
        double d = 1.23456789;
        boolean succeeded = true;
        char[] str1 = new char[10]; // this is not object-oriented

        /* These are called Boxed values */
        Integer integer = 10;
        Long along = 929213813421784128L;
        Float afloat = 1.23456789f;
        Double adouble = 1.23456789;
        Boolean b = true;
        String str2 = "Hello";

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        List<Integer> integers = List.of(1, 3, 5, 7);

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
    }
}