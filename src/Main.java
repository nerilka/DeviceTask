import devices.RingDevice;
import devices.devices.CellPhone;
import user.Human;

public class Main {
    public static void main(String[] args) {
        int number=123;
       Human human = new Human(number, new CellPhone(number));
       CellPhone cellPhone = new CellPhone(112);

       human.useDevice(cellPhone);



    }
}
