package devices.devices;

import devices.Stationery;
import devices.generation.FirstGeneration;

public abstract class LandLineTelephone extends Stationery implements FirstGeneration {

    @Override //метод от интерфейса
    public void onlyCall() {
        System.out.println("Я звоню");
    }


}
