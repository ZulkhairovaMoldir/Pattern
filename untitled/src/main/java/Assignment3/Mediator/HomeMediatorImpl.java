package Assignment3.Mediator;

import java.util.HashMap;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator{

    private Map<String, String> sensorData = new HashMap<>();

    @Override
    public void inputData(String sencor,String data) {
        sensorData.put(sencor, data);
    }

    @Override
    public void printReport() {
        System.out.println("Home Report:");
        for (Map.Entry<String, String> en : sensorData.entrySet()) {
            System.out.println(en.getKey() + ": " + en.getValue());
        }

    }
}
