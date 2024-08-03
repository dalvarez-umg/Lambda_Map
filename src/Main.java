import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Juan", "José");

        // Usando lambda para mapear a la longitud de cada cadena
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println("Longitudes de nombres: " + nameLengths);
    }
}
