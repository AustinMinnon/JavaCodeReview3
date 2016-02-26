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

  @Test
  public void save_savesIntoDatabase_true() {
    Stylist myStylist = new Stylist("Joe");
    myStylist.save();
    assertTrue(Stylist.all().get(0).equals(myStylist));
  }
}
