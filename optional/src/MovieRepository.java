import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MovieRepository {
  private static final List<Movie> mangas = List.of(new Movie(1, "movie1", 50), new Movie(2, "movie2", 25));

  public static Optional<Movie> findById(Integer id) {
    return findBy(m -> m.getId().equals(id));
  }

  public static Optional<Movie> findByTitle(String title) {
    return findBy(m -> m.getTitle().equals(title));
  }

  private static Optional<Movie> findBy(Predicate<Movie> predicate) {
    Movie found = null;
    for (Movie manga : mangas) {
      if (predicate.test(manga)) {
        found = manga;
      }
    }
    return Optional.ofNullable(found);
  }
}
