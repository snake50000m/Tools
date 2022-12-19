public class Pipe implements Tool{
    private double diameter;

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба диаметром %.1f см\n", diameter);
    }
}
