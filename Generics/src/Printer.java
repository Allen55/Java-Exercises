public class Printer <T>{ //can be called anything

    T thingsToPrint;

    public Printer(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }

}
