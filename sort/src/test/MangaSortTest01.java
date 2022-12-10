package test;

import domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
  public static void main(String[] args) {
    List<Manga> mangas = new ArrayList<>(3);
    mangas.add(new Manga(1L, "Pokemon", 4.99));
    mangas.add(new Manga(3L, "Zetsuen no Tempest", 13.99));
    mangas.add(new Manga(2L, "Ao no Exorcist", 5.99));

    for (Manga manga : mangas) {
      System.out.println(manga);
    }

    Collections.sort(mangas);

    for (Manga manga : mangas) {
      System.out.println(manga);
    }
  }
}