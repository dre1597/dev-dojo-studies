import java.util.Optional;

public class OptionalTest02 {
  public static void main(String[] args) {
    Optional<Movie> movieByTitle = MovieRepository.findByTitle("movie1");
    movieByTitle.ifPresent(m -> m.setTitle("movie2"));
    System.out.println(movieByTitle);

    Movie mangaById = MovieRepository.findById(2).orElseThrow(IllegalArgumentException::new);
    System.out.println(mangaById);

    Movie newMovie = MovieRepository.findByTitle("movie3")
        .orElseGet(() -> new Movie(3, "movie3", 20));

    System.out.println(newMovie);
  }
}
