package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    static List<String> veggies = List.of(
            "spinach",
            "cabbages",
            "peas",
            "cauliflower",
            "green beans",
            "brussels sprouts",
            "carrots"
    );

    public static void main(String[] args)
    {
//        anyMatchDemo();
//        allMatchDemo();
//        filterDemo();
//        mapDemo();
//        reduceDemo();
//        intReduceDemo();
//        collectDemo();
//        multiOperationDemo();
    }

    // anyMatch() operation
    public static void anyMatchDemo(){
        boolean anyMatches = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchDemo(){
        boolean allMatches = veggies.stream().allMatch(v -> v.contains("s"));
        System.out.println(allMatches);
    }

    public static void filterDemo(){
        veggies.stream()
                .filter(v->v.startsWith("c")) // not terminal - can keep doing things
                .forEach(System.out::println);  // terminal - stream ends.
    }

    public static void mapDemo(){
        veggies.stream()
                .map(String::toUpperCase) // equivalent to v -> v.toUppercase()
                .forEach(System.out::println);
    }

    public static void reduceDemo(){
        System.out.println(
                veggies.stream()
                        .sorted()
                .reduce("",(a, b) -> a + " | " + b));

    }

    public static void intReduceDemo(){
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        System.out.println(numbers.stream()
                .reduce(0, (a, b) -> a+b)); // returns type of list fed into it. In this case Integer.
        // eg.
        var sum = numbers.stream().reduce(0, (a, b) -> a+b);
    }

    public static void collectDemo(){
        List veggiesEndingInS = veggies.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());

        veggiesEndingInS.forEach(System.out::println);
    }

    public static void multiOperationDemo(){
        veggies.stream()
                .sorted()
                .filter(v->v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yummy " + w))
                .forEach(System.out::println);
    }
}
