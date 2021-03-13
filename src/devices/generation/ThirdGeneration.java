package devices.generation;

public interface ThirdGeneration extends SecondGeneration {
    @Override
    void onlyCall();

    @Override
    void sendMessage();

    void goOnline();
}
