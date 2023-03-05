import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList travelBucketList = new LinkedList();

//        Add and Access Items
        travelBucketList.add("Tokyo");
        travelBucketList.addFirst("Osaka");
        travelBucketList.addLast("Okinawa");
        System.out.println(travelBucketList);
        travelBucketList.addLast("Saga");
        travelBucketList.addFirst("Nagano");
        travelBucketList.add("Aomori");
        travelBucketList.add(1, "#1");
        System.out.println(travelBucketList);
        System.out.println(travelBucketList.get(2));
        System.out.println(travelBucketList.contains("Osaka"));

//        Remove
        travelBucketList.removeFirst();
        travelBucketList.removeLast();
        System.out.println(travelBucketList);
        travelBucketList.remove("#1");
        travelBucketList.remove(2);
        System.out.println(travelBucketList);

    }
}
