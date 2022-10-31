import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add("Shibu");
        al.add('c');

        HashSet hs = new HashSet<>();
        hs.add("Shibu");
        hs.add(29);
        hs.add("tree");
        System.out.println(al);
        System.out.println(hs);
        al.addAll(hs);
        System.out.println(al);

    }

}