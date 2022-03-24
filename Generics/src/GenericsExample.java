import java.util.ArrayList;
import java.util.List;

public class GenericsExample {


    public static void main(String[] args) {

        Printer<Integer> printer = new Printer(23);
        printer.print();
        Printer<Double> doublePrinter = new Printer(33.5);
        doublePrinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("craig"));
        Cat myCat = (Cat)cats.get(0);

        shout("John", 75);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("timmy"));
        printList(catList);
    }

    private static <T, V> T shout(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");
        return thingToShout;
    }

    public static void printList(List<?> myList){ // ? when you don't know what the generic type will be
        System.out.println();
    }

}
