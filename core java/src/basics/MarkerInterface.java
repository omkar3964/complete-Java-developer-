package basics;
interface Printable{

}

class Report implements Printable{
    void show(){
        System.out.println("Report is Printing");
    }
}
class Privatenote {
    void display(){
        System.out.println("This is private Notes.");
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Report report = new Report();
        Privatenote note = new Privatenote();

        if(report instanceof Printable)
            report.show();

        if(note instanceof Printable)
            note.display();
        else
            System.out.println("This is private , we cant access it");
    }
}
