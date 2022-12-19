import java.awt.image.Kernel;

public class Drum implements Tool{
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан размером %.1f см ноту %s\n", size, KEY);
    }
}
