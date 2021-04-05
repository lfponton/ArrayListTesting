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

  @Test void addWrongIndexException() {
    assertThrows(IndexOutOfBoundsException.class, () -> list.add(1, 3));
  }


}