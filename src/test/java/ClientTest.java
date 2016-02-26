import org.junit.*;
import static org.junit.Assert.*;

public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void all_emptyInitially() {
    assertEquals(Client.all().size(), 0);
  }

  @Test
  public void equals_returnTrueIfClientsAreEqual() {
    Client firstClient = new Client("Jerry", 1);
    Client secondClient = new Client("Jerry",1);
    assertTrue(firstClient.equals(secondClient));
  }
}
