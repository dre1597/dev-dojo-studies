import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
  public static void main(String[] args) {
    Optional<String> o1 = Optional.of("Test");
//    Optional<String> o2 = Optional.of(null); NOT POSSIBLE
    Optional<String> o2 = Optional.ofNullable(null); // Imagine a nullable object not null itself
    Optional<String> o3 = Optional.empty();

    System.out.println(o1);
    System.out.println(o2);
    System.out.println(o3);

    Optional<String> name = Optional.ofNullable(findName("name1"));

    String notFound = name.orElse("NOT FOUND");
    name.ifPresent(s -> System.out.println(s.toUpperCase()));
    System.out.println(notFound);

    System.out.println("-----");

    Optional<String> name2 = Optional.ofNullable(findName("name2"));

    String notFound2 = name2.orElse("NOT FOUND");
    name2.ifPresent(s -> System.out.println(s.toUpperCase()));
    System.out.println(notFound2);
  }

  private static String findName(String name) {
    List<String> list = List.of("name2", "name3");

    int i = list.indexOf(name);
    if (i != -1) {
      return list.get(i);
    }
    return null;
  }
}
