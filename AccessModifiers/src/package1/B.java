package package1;
import package2.*;

public class B {
    // something that is private is only visible to the class that contains itself.
    // only class b has access to this private message
    String privateMessage = "this is private";

}
