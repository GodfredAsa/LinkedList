import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesVisiting  = new LinkedList<>();
        placesVisiting.add("USA");
        placesVisiting.add("Dubai");
        placesVisiting.add("Germany");
        placesVisiting.add("Mexico");

        printList(placesVisiting);
        // inserting Canada at index of 1 and push the rest down of it
        placesVisiting.add(1, "Canada");
        printList(placesVisiting);

        // removing an element
        placesVisiting.remove(3);
        printList(placesVisiting);
    }

    private static void printList(LinkedList<String> myList){

        Iterator<String> i  = myList.iterator();
        int counter = 0;
        while(i.hasNext()){
            counter++;
            System.out.println(counter + ". Visinting " + i.next());
        }
        System.out.println("***** end of vacation ***** ");
    }
}
