import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    // FIFO (First in First out) - a collection designed for holding elements prior to processing.

    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 30));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    static record Person(String name, int age){}
}
