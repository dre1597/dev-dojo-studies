package demo.devdojo.maratonajava.optional;

public class Movie {
  private final Integer id;
  private String title;
  private int duration;

  public Movie(Integer id, String title, int duration) {
    this.id = id;
    this.title = title;
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "demo.devdojo.maratonajava.optional.Movie{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", duration=" + duration +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}
