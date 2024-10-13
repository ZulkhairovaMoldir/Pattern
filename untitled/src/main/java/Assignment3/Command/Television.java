package Assignment3.Command;

public class Television {

    private int vol = 5;
    private int chan = 2;

    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        if (vol < 10) {
            vol++;
            System.out.println("Громкость увеличена до " + vol);
        } else {
            System.out.println("Невозможна увеличить");
        }
    }

    public void volumeDown() {
        if (vol > 0) {
            vol--;
            System.out.println("Громкость уменьшена до " + vol);
        } else {
            System.out.println("Невозможна уменьшить");
        }
    }

    public void nextChannel() {
        chan++;
        System.out.println("Переключение на канал " + chan);
    }

    public void previousChannel() {
        if (chan > 1) {
            chan--;
            System.out.println("Переключение на канал " + chan);
        } else {
            System.out.println("Невозможна переключит");
        }
    }
}
