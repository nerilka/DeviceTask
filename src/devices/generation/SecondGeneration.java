package devices.generation;

public interface SecondGeneration extends FirstGeneration{
    @Override
    void call();

    void sendMessage();
}
