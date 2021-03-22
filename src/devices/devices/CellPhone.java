package devices.devices;

import devices.Mobile;
import devices.generation.SecondGeneration;
import user.PhoneType;

public class CellPhone extends Mobile implements SecondGeneration {

    private PhoneType phoneType = PhoneType.CELLPHONE;
//    String phone = "CELLPHONE";

    @Override
    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public void setPhoneType(PhoneType phoneType) {
        super.setPhoneType(phoneType);
    }

    public CellPhone(int number) {
        super(number);
    }

    @Override //метод от интерфейса
    public void call() {
        System.out.println("Я звоню ");

    }

    @Override //метод от интерфейса
    public void sendMessage() {
        System.out.println("Я отправляю сообщение ");

    }


}
