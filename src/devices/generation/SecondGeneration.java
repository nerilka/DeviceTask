package devices.generation;

public interface SecondGeneration extends FirstGeneration{
    @Override
    void onlyCall();

    void sendMessage();
}
