package loosecouplingwithspringcontd;

public class AirtelCallCardService implements AirtelService{


    @Override
    public void service() {
        System.out.println("Airtel call service");
    }
}
