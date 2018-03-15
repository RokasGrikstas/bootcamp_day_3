import java.util.HashSet;
import java.util.Set;

public class SetPvz {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(123);
        hashSet.add(3);
        hashSet.add(13);
        hashSet.add(12);
        hashSet.add(1);
        hashSet.add(123);
        hashSet.add(123);

        for(Integer a:hashSet){
            System.out.println(a);
        }
    }
}
