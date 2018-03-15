import java.util.HashMap;
import java.util.Map;

public class MapPvz {

    public static void main(String[] args) {


        Map<String, String> names = new HashMap<>();

        names.put("Pirmas", "Jonas");
        names.put("Trecias", "Antanas");
        names.put("Antras", "Andrius");
        names.put("Ketvirtas", "Jonas");
        names.put("Penktas", "Bla");
        names.put("Pirmas", "Trampampam");

        for(String name : names.keySet()){
            System.out.println(name + " " + names.get(name));
        }



    }
}
