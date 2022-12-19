public class Guitar implements Tool{
    private int stringsCount;

    public Guitar(int stringsCount) {
        this.stringsCount = stringsCount;
    }

    @Override
    public void play() {
        if(stringsCount==1) {
            System.out.printf("Играет гитара с %d струной ноту %s\n", stringsCount, KEY);
        }else System.out.printf("Играет гитара с %d струнами ноту %s\n", stringsCount, KEY);

    }
}
