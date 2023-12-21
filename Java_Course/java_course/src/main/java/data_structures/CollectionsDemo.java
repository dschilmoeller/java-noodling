package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple"); // note duplicates are not entered into the set twice.

        // iterator:
        var i = fruits.iterator();
//        hasNext() - returns boolean, true if there are more elements in array.
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(fruits); // note this does not necessarily come out in the same order they were entered.

        // check if set contains a value.
        System.out.println("contains lemon: " + fruits.contains("lemon"));
        // remove from set & recheck for presence
        fruits.remove("lemon");
        System.out.println("contains lemon: " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        // add multiple objects or initial data more efficiently.
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        // careful when doing this - the set is now immutable. .add, .remove, &c does not work.
        // .contains() &c do still work.

    }

    public static void listDemo(){
//        List fruits = new ArrayList();
        List<String> fruits = new ArrayList<String>(); // updated initializer to remove warnings.
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
//        System.out.println(fruits); // note comes out in order they were added, has duplicate.

        // enhanced For Loop:
        // note List becomes List<String> in fruits initialization above to remove error below in enhanced for loop

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        // forEach loop with Lambda expression:
        fruits.forEach(f->System.out.println(f));
        fruits.forEach(g->{
            System.out.println("Fruit: " + g);
            // more code here.
        });
        // even shorter shorthand for when the above is too long.
        // can reference any method instead of println.
        fruits.forEach(System.out::println);

//        // replacing items - index, replacement items.
//        fruits.set(2, "cherry");
//        System.out.println(fruits);
//
//        // removing by object or index:
////        fruits.remove("apple"); // removes FIRST instance found in List.
//
//        // removing by index
//        fruits.remove(0);
//        System.out.println(fruits);
//
//        // select by index:
//        System.out.println("index 2: " + fruits.get(2));
//
//        // get index:
//        System.out.println("Index of orange: " + fruits.indexOf("orange"));
//
//        // get last index (in case of multiple items)
//        System.out.println("Last index of: " + fruits.lastIndexOf("orange"));
//
//        // immutable List.of creation:
//        List moreFruit = List.of("cherry", "plum", "grapple");
//        // can do .get, indexOf but not .remove, .set and the like.

    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana"); // queues do allow for duplicate elements.

        System.out.println(fruits);

        // remove() removes first item in list.
//        fruits.remove(); // known as the head of the line. Last is called tail.
        // special note - returns object back.
        var removed = fruits.remove();
        System.out.println(removed); // shows removed object.
        System.out.println(fruits); // shows queue sans object.

        // see head of queue w/o removing.
        var peek = fruits.peek();
        System.out.println("Head of queue: " + peek);


    }

    public static void mapDemo() {

//        Map fruitCalories = new HashMap();
        Map<String, Integer> fruitCalories = new HashMap(); // updated for enhanced for loop.
        // note Map is unordered.
        // cannot contain duplicate KEYS - replaces existing. Duplicate values okay.
        fruitCalories.put("apple", 100); // note the numbers are Integers, not int
        fruitCalories.put("banana", 150);
        fruitCalories.put("cherry", 10);
        fruitCalories.put("kiwi", 95);
        fruitCalories.put("apple", 105); // attempt to add; replaces existing instead.
        fruitCalories.putIfAbsent("apple", 200); // this does nothing, because apple is not absent.
        fruitCalories.putIfAbsent("lemon", 99); // this does something, because lemon is not in the map atm.
        fruitCalories.remove("lemon"); // removes the lemon key-value pair.

        // forEach loop:
        fruitCalories.forEach( (k, v) -> {
            System.out.println(k + " : " + v);
        });

//        // enhanced for loop
//        for(Map.Entry<String, Integer> calorieInfo : fruitCalories.entrySet()) {
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }

//        System.out.println(fruitCalories);
//
//        System.out.println("cherry calories: " + fruitCalories.get("cherry"));
//        System.out.println("Contains orange: " + fruitCalories.containsKey("orange") );
//
//        Map immutableFruitCalories = Map.of(
//                "apple", 95,
//                "lemon", 20,
//                "jackfruit", 33
//        );
//        System.out.println(immutableFruitCalories);
//        System.out.println("Jackfruit cals: " + immutableFruitCalories.get("jackfruit"));
//
////        iterating through a map is somewhat trickier. This method is comparable but NOT recommended.
//        // first must create a set out of the map.
//        // seems super important to note that changes are two way per the entrySet doc.
//        Set mapFruit = fruitCalories.entrySet();
//        // since it is now a set, an iterator can be made.
//        var i = mapFruit.iterator();
//
//        while(i.hasNext()){
//            // each entry has to be cast as a Map.Entry
//            Map.Entry entry = (Map.Entry)i.next(); // cast next element as Map.Entry
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}
