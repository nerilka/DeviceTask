package devices.devices;

import devices.Mobile;
import devices.generation.SecondGeneration;

public class CellPhone extends Mobile implements SecondGeneration {

    public CellPhone(int number) {
        super(number);
    }

    @Override //метод от интерфейса
    public void call() {
        System.out.println("Я звоню");
    }


    @Override //метод от интерфейса
    public void sendMessage() {
        System.out.println("Я отправляю сообщение");

    }


}
