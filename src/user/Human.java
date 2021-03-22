package user;

import devices.RingDevice;
import devices.devices.CellPhone;
import devices.devices.LandLineTelephone;
import devices.devices.SmartPhone;

public class Human {
    private int number;
    private RingDevice device;
    private PhoneType phoneType;

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public Human() {
    }

    public Human(RingDevice device) {
        this.device = device;
    }

    public Human(int number) {
        this.number = number;
    }

    public Human(int number, RingDevice device) {
        this.number = number;
        this.device = device;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RingDevice getDevice() {
        return device;
    }

    public void setDevice(RingDevice device) {
        this.device = device;
    }

    public void useDevice() {
        RingDevice device = this.device;
        switch (device.getPhoneType()) {
            case LANDLINETELEPHONE:
                ((LandLineTelephone) device).call();
                break;
            case CELLPHONE:
                ((CellPhone) device).call();
                ((CellPhone) device).sendMessage();
                break;
            case SMARTPHONE:
                ((SmartPhone) device).call();
                ((SmartPhone) device).sendMessage();
                ((SmartPhone) device).goOnline();
                break;

            default:
                System.out.println("some mistake");
        }


//       public void useDevice() {
//           RingDevice device = this.device;
//        if (device != null) {
//            if (device instanceof LandLineTelephone) {
//                ((LandLineTelephone) device).call();
//            }
//            if (device instanceof CellPhone) {
//                ((CellPhone) device).call();
//                ((CellPhone) device).sendMessage();
//            }
//            if (device instanceof SmartPhone) {
//                ((SmartPhone) device).call();
//                ((SmartPhone) device).sendMessage();
//                ((SmartPhone) device).goOnline();
//            }
//        } else {
//            System.out.println("some mistake");
//        }
    }
}
