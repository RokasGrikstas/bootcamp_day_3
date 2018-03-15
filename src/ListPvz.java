import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListPvz {

    public static void main(String[] args) {

        List<String> vardai = new ArrayList<>();

        vardai.add("andrius");
        vardai.add("tomas");
        vardai.add("jonas");
        vardai.add("antanas");
        vardai.add("jokubas");
        Collections.sort(vardai);

        for(String name: vardai){
            System.out.println(vardai);
        }

        System.out.println(vardai.get(3));

        System.out.println(vardai.size());

        System.out.println(vardai.isEmpty());

        System.out.println(vardai.contains("jonas"));
    }
}
