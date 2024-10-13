package Assignment3.Mediator;

public class TemperatureSensor implements Sensor{
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "17 градусов";
        mediator.inputData("Temperature", data);
    }
}
