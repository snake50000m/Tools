public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(5);
        Drum drum = new Drum(80);
        Pipe pipe = new Pipe(25);
        Tool[] tools = new Tool[]{guitar, drum, pipe};
        for (Tool a: tools) {
            a.play();
        }

    }
}