package devices.generation;

public interface ThirdGeneration extends SecondGeneration {
    @Override
    void call();

    @Override
    void sendMessage();

    void goOnline();
}
