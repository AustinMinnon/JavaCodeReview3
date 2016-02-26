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

  @Test
  public void save_returnsTrueIfClientExists_true() {
    Client myClient = new Client("Jamal", 1);
    myClient.save();
    assertTrue(Client.all().get(0).equals(myClient));
  }

  @Test
  public void save_assignsIdToClientObject() {
    Client myClient = new Client("Carl", 1);
    myClient.save();
    Client savedClient = Client.all().get(0);
    assertEquals(myClient.getId(), savedClient.getId());
  }

  @Test
  public void find_findsClientInDatabase_true() {
    Client myClient = new Client("Carl", 3);
    myClient.save();
    Client savedClient = Client.find(myClient.getId());
    assertTrue(myClient.equals(savedClient));
  }


}
