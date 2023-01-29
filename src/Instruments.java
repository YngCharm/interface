public class Instruments {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum("124");
        instruments[2] = new Trumpet(15);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}