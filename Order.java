import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Order {
 private Customers customer ;
 private Restaurants restaurant ;
 private Address deliveryAddress ;
private List<OrderItem> items=new ArrayList<>();
private LocalDateTime time ;
private Lifecycle status=Lifecycle.PLACED;
public void changeState(Lifecycle status){
 if (status.ordinal()>this.status.ordinal()&&status.ordinal()<this.status.ordinal()+2){
  this.status=status;
 }
}
}
