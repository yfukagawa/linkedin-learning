import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("ham");
        System.out.println(shoppingList);
        shoppingList.add(1, "cheese");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        shoppingList.addLast("milk");
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
