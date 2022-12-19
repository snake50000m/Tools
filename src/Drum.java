public class Drum implements Tool{
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан размером %.1f см\n", size);
    }
}
