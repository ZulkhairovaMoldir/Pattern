package Assignment3.Mediator;

public class LightSensor implements Sensor{
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "Turn On";
        mediator.inputData("Light", data);
    }
}
