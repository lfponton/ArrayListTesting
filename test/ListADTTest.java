import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListADTTest
{
  private ListADT list;
  @BeforeEach void setup()
  {
    list = new ArrayList();
  }

  @Test void addMany() {
    list.add(0,3);
    list.add(1, 21);
    list.add(2,42);
    assertEquals(3, list.get(0));
    assertEquals(21, list.get(1));
    assertEquals(42, list.get(2));
  }

  @Test void addAnyWrongIndexException() {
    assertThrows(IndexOutOfBoundsException.class, () -> list.add(23, 3));
  }

  @Test void addWithNegativeIndexException() {
    assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 4));
  }

  @Test void addNullElement() {
    list.add(null);
    assertNull(list.get(0));
  }

  @Test void addFullList() {
    for (int i = 0; i < 200; i++)
    {
      list.add(i,i);
    }
    assertTrue(list.isFull());
  }




}