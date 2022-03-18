package package1;
import package2.*;

public class A {
    // Anything that uses the public keyword is visibile to any package within the project folder
    // Even though this is in package 2 its visible to package1
    // Something that is protected is accessible to a different class in a different package
    // as long as that class is a subclass of whatever class contains the protected member
    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {
        B b = new B();
        //System.out.println(b.privateMessage); //will not print because it's not visible because something that's
                                                // private is only visible to the class that contains it.
    }

}
