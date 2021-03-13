import devices.RingDevice;
import user.Human;

public class Main {
    public static void main(String[] args) {
        RingDevice device = new RingDevice();
        Human human = new Human(123, device);

    }
}
