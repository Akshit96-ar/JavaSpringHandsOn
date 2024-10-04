import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Study {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);


        System.out.println(map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e-> e.getValue()+1)));



    }
}
