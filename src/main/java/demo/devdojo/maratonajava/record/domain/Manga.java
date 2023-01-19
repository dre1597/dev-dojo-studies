package demo.devdojo.maratonajava.record.domain;

import java.util.Objects;

public record Manga(String name, int episodes) {
  public Manga {
    Objects.requireNonNull(name);
    if (episodes <= 0) {
      throw new IllegalArgumentException();
    }
  }
}
