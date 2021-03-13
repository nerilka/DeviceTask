package devices.devices;

import devices.generation.ThirdGeneration;

public abstract class SmartPhone extends CellPhone implements ThirdGeneration {

    @Override //метод от интерфейса
    public void onlyCall() {
        System.out.println("Я звоню");
    }

    @Override //метод от интерфейса
    public void sendMessage() {
        System.out.println("Я отправляю сообщение");
    }

    @Override //метод от интерфейса
    public void goOnline() {
        System.out.println("Я выхожу в Интернет");
    }
}
