import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    /**
     * Linked list concepts of adding and re-ordering of added elements alphabetically
     * printList() takes a linked list as arguments and print the content
     * addInOrder() takes linked list and string as arguments to add the string and order it
     * alphabetically respective of the order of adding the elements
     * when a city is already added duplication is disallowed
     */
    public static void main(String[] args) {
        LinkedList<String> placesVisiting  = new LinkedList<>();

        addInOrder(placesVisiting, "Sydney");
        addInOrder(placesVisiting, "Melbourne");
        addInOrder(placesVisiting, "Brisbane");
        addInOrder(placesVisiting, "Perth");
        addInOrder(placesVisiting, "Canberra");
        addInOrder(placesVisiting, "Adelaide");
        addInOrder(placesVisiting, "Darwin");

        printList(placesVisiting);

        addInOrder(placesVisiting, "Darwin");
        printList(placesVisiting);


//        placesVisiting.add("USA");
//        placesVisiting.add("Dubai");
//        placesVisiting.add("Germany");
//        placesVisiting.add("Mexico");
//
//        printList(placesVisiting);
//        // inserting Canada at index of 1 and push the rest down of it
//        placesVisiting.add(1, "Canada");
//        printList(placesVisiting);
//
//        // removing an element
//        placesVisiting.remove(3);
//        printList(placesVisiting);
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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison  = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                //equal, do not match
                System.out.println( "-"+ newCity + " already added to list");
                return false;
            }else if(comparison>0){
                // newCity should appear before this code
                stringListIterator.previous(); //used previous the comparison moved to the next
                // element hence we have to start at the beginning to check all.
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){
                //move to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
