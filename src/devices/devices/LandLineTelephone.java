package devices.devices;

import devices.Stationery;
import devices.generation.FirstGeneration;

public abstract class LandLineTelephone extends Stationery implements FirstGeneration {

    public LandLineTelephone(int number) {
        super(number);
    }

    @Override //метод от интерфейса
    public void call() {
        System.out.println("Я звоню");
    }


}
