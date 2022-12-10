package test;

import domain.Manga;
import domain.MangaByIdComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
  public static void main(String[] args) {
    List<Manga> mangas = new ArrayList<>(3);
    Manga mangaToSearch = new Manga("Ao no Exorcist", 5.99);

    mangas.add(new Manga("Pokemon", 4.99));
    mangas.add(new Manga("Zetsuen no Tempest", 13.99));
    mangas.add(mangaToSearch);

    for (Manga manga : mangas) {
      System.out.println(manga);
    }

    mangas.sort(new MangaByIdComparator());

    for (Manga manga : mangas) {
      System.out.println(manga);
    }

    System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator()));
  }
}
