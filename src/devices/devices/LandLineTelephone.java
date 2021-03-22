package devices.devices;

import devices.Stationery;
import devices.generation.FirstGeneration;
import user.PhoneType;

public class LandLineTelephone extends Stationery implements FirstGeneration {

    private PhoneType phoneType = PhoneType.LANDLINETELEPHONE;
 //   String phone = "LANDLINETELEPHONE";

    public LandLineTelephone(int number) {
        super(number);
    }

    @Override
    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public void setPhoneType(PhoneType phoneType) {
        super.setPhoneType(phoneType);
    }

//    public LandLineTelephone(int number) {
//        super(number);
//    }

    @Override //метод от интерфейса
    public void call() {
        System.out.println("Я звоню ");
    }

}
