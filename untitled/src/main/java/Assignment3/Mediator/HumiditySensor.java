package Assignment3.Mediator;

public class HumiditySensor implements Sensor{
    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "25%";
        mediator.inputData("Humidity", data);
    }
}
