package arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arrays are cool");

        Array<Integer> items = new Array<Integer>(2);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);
        items.insert(50);

        // items.deleteAt(1);
        System.out.println("index : " + items.indexOfWithTwoPointers(30));

        // System.out.println(items);
    }
}
