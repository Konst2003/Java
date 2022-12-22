import java.util.ArrayList;
public class TestPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arrayList = new ArrayList<>(){{
            add(new Book("Stiven King","IT"));
            add(new Shop("Chitai-gorod"));
            add(new Book("Lermontov","Borodino"));
        }};
        for (Printable printable: arrayList) printable.print();
    }
}