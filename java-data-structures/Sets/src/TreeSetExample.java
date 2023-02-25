import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet); //auto sorts in ascending order
        treeSet.add(6);
        treeSet.add(61);
        System.out.println(treeSet); //cannot store duplicates, so the second 6 will not show

        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet); //as default, sort the words in the alphabetical order

        Set<String> wordSet1 = new TreeSet<>(Comparator.comparing(String::length));
        wordSet1.add("tiger");
        wordSet1.add("giraffe");
        wordSet1.add("bear");
        System.out.println(wordSet1);
        wordSet1.add("wolf");
        //this will not show because it is a four-letter word,
        // and a four-letter word "bear" already exists.
        // By the given condition, this is considered a duplicate,
        // so the word "wolf" does not get stored in this list.
        wordSet1.add("poller bear");
        System.out.println(wordSet1);
        wordSet1.remove("bear");
        System.out.println(wordSet1);
        wordSet1.add("wolf");
        System.out.println(wordSet1);
    }
}
