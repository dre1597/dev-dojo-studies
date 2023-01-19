package demo.devdojo.maratonajava.record.test;

import demo.devdojo.maratonajava.record.domain.Manga;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {

  private Manga manga1;
  private Manga manga2;

  @BeforeEach
  public void setup() {
    manga1 = new Manga("manga1", 12);
    manga2 = new Manga("manga1", 12);

  }

  @Test
  public void accessorsReturnDataWhenInitialized() {
    Assertions.assertEquals("manga1", manga1.name());
    Assertions.assertEquals(12, manga1.episodes());
  }

  @Test
  public void equalsReturnTrueWhenInitialized() {
    Assertions.assertEquals(manga1, manga2);
  }

  @Test
  public void hashCodeReturnTrueWhenInitialized() {
    Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
  }

  @Test
  public void constructorThrowNullPointerExceptionWhenNameIsNull() {
    Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 12));
  }

  @Test
  public void constructorThrowNullPointerExceptionWhenEpisodesIsNull() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Manga("manga1", 0));
  }

  @Test
  public void isRecordReturnTrueWhenCalledFromManga() {
    Assertions.assertTrue(Manga.class.isRecord());
  }
}
