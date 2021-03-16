package user;


import devices.RingDevice;
import devices.devices.CellPhone;
import devices.devices.LandLineTelephone;
import devices.devices.SmartPhone;

public class Human {
    int number;
    RingDevice device;

    public Human() {
    }

    public Human(int number) {
        this.number = number;
    }

    public Human(int number, RingDevice device) {
        this.number = number;
        this.device = device;
    }

    public void useDevice(RingDevice device) {
        if (device != null) {
            if (device instanceof LandLineTelephone) {
                ((LandLineTelephone) device).call();
            }
            if (device instanceof CellPhone) {
                ((CellPhone) device).call();
                ((CellPhone) device).sendMessage();
            }
            if (device instanceof SmartPhone) {
                ((SmartPhone) device).call();
                ((SmartPhone) device).sendMessage();
                ((SmartPhone) device).goOnline();
            }
        }
        else {
            System.out.println("some mistake");
        }
    }
}
