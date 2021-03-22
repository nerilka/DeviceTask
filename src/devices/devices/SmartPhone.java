package devices.devices;

import devices.Mobile;
import devices.generation.ThirdGeneration;
import user.PhoneType;

public class SmartPhone extends Mobile implements ThirdGeneration {

    private PhoneType phoneType = PhoneType.SMARTPHONE;
//    String phone = "SMARTPHONE";

    @Override
    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public void setPhoneType(PhoneType phoneType) {
        super.setPhoneType(phoneType);
    }

    public SmartPhone(int number) {
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

    @Override //метод от интерфейса
    public void goOnline() {
        System.out.println("Я выхожу в Интернет ");
    }
}
