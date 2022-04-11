import java.util.ArrayList;

public class ArrayLists {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();

        for (int i = 0; i < 10; i++){
            name.add("name #" + i);

        }

        for (int i = 0; i < 10; i++){
            System.out.println(name.get(i));
        }
    }

}
