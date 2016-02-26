import java.util.List;
import org.sql2o.*;

public class Client {
  private int id;
  private int stylistId;
  private String name;

  public int getId() {
      return id;
  }

  public String getName() {
    return name;
  }

  public int getStylistId() {
    return stylistId;
  }

  public Client(String name, int stylistId) {
    this.name = name;
    this.stylistId = stylistId;
  }

  @Override
  public boolean equals(Object otherClient){
    if (!(otherClient instanceof Client)) {
      return false;
    } else {
      Client newClient = (Client) otherClient;
      System.out.println(this.getStylistId());
      System.out.println(newClient.getStylistId());
      return this.getName().equals(newClient.getName()) &&
             this.getId() == newClient.getId() &&
             this.getStylistId() == newClient.getStylistId();
    }
  }
}
