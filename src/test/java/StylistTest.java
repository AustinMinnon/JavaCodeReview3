import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void all_emptyInitially() {
    assertEquals(Stylist.all().size(), 0);
  }

  @Test
  public void equals_returnTrueIfStylistsAreEqual() {
    Stylist firstStylist = new Stylist("Jimmy");
    Stylist secondStylist = new Stylist("Jimmy");
    assertTrue(firstStylist.equals(secondStylist));
  }
}
