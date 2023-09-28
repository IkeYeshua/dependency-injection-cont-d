package loosecouplingwithspringcontd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airtel {
    private AirtelService airtelService;

    public void setAirtelService( AirtelService airtelService) {
        this.airtelService = airtelService;
    }

    public void airtelServiceRendering(){
        airtelService.service();
    }



}
