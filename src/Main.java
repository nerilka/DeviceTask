import devices.devices.CellPhone;
import devices.devices.LandLineTelephone;
import devices.devices.SmartPhone;
import user.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        LandLineTelephone landLineTelephone = new LandLineTelephone(111);
        System.out.println("У меня городской телефон и мой номер " + landLineTelephone.getNumber());
        human.setDevice(landLineTelephone);
        human.useDevice();

        CellPhone cellPhone = new CellPhone(112);
        System.out.println("У меня сотовый телефон и мой номер " + cellPhone.getNumber());
        human.setDevice(cellPhone);
        human.useDevice();

        SmartPhone smartPhone = new SmartPhone(113);
        System.out.println("У меня смартфон и мой номер " + smartPhone.getNumber());
        human.setDevice(smartPhone);
        human.useDevice();
    }
}
