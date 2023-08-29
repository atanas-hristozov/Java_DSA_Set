import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Atanas");
        nameSet.add("Ivan");
        nameSet.add("Georgi");
        System.out.println(nameSet.size());
        nameSet.add("Simo");
        System.out.println(nameSet.size());
        System.out.println(nameSet.add("Ina"));
        System.out.println(nameSet.add("Ivan"));
        System.out.println(nameSet.contains("Iva"));
        System.out.println(nameSet.remove("Simo"));
        List<String> names =
        nameSet.stream().filter(name -> name.contains("a")).collect(Collectors.toList());
        System.out.println(names);
        Set<String> namesTreeSet = new TreeSet<>(nameSet);
        System.out.println(namesTreeSet);
    }
}