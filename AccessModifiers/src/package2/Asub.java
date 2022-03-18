package package2;

import package1.*;

public class Asub extends A{
    //Asub extends even though A is in a different package we have access to this protected variable
    // because something that is protected is accessible to a different class in a different package
    // as long as that class is a subclass of whatever class contains that protected member
    public static void main(String[] args) {
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }

}
