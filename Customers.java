import java.util.ArrayList;
import java.util.List;

public class Customers {
    private int id ;
    private String name ;
    private List<Address> addresses=new ArrayList<>();
    private String mobileNumber ;
    private double walletBalance ;
    private loyaltyTier loyaltytier;
    private  int completedOrders;

    public void CalculateloyaltyTier(){

        if(completedOrders>=0 && completedOrders<=9){
            loyaltytier=loyaltyTier.Bronze;
        }
        else if(completedOrders>=10 && completedOrders<=29){
            loyaltytier=loyaltyTier.Silver;
        }
        else if(completedOrders>=30){
            loyaltytier=loyaltyTier.Gold;
        }


    }
}
