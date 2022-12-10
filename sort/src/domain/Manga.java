package domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

//public class Manga implements Comparable<Manga> {
public class Manga {
  private final Long id;
  private String title;
  private double price;

  public Manga(String title, double price) {
    this.id = ThreadLocalRandom.current().nextLong();
    Objects.requireNonNull(title, "Title must not be null");
    this.title = title;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Manga{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", price=" + price +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Manga manga = (Manga) o;
    return id.equals(manga.id) && title.equals(manga.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }

//  @Override
//  public int compareTo(Manga other) {
//    return this.id.compareTo(other.id);
//  }
}
