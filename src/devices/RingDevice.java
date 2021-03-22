package devices;

import user.PhoneType;

public abstract class RingDevice {
    private PhoneType phoneType;

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

   private static int number;

    public RingDevice(int number) {
        RingDevice.number = number;
    }

     public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    //    public RingDevice(Stationery stationery) {
//        this.stationery = stationery;
//    }
//
//    public RingDevice(Mobile mobile) {
//        this.mobile = mobile;
//    }

}
