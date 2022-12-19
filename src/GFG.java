import java.util.*;
public class GFG {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Ravi");
        ll.add("Yash");
        ll.addLast("Adarsh");
        ll.addFirst("Suresh");
        ll.add(2, "Ajay");

        System.out.println(ll);
        Iterator i = ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ll.remove("Yash");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
