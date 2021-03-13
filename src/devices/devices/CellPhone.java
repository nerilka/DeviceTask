package devices.devices;

import devices.Mobile;
import devices.generation.SecondGeneration;

public abstract class CellPhone extends Mobile implements SecondGeneration {

   @Override //метод от интерфейса
    public void onlyCall() {
        System.out.println("Я звоню");
    }

    @Override //метод от интерфейса
    public void sendMessage() {
        System.out.println("Я отправляю сообщение");

    }


}
