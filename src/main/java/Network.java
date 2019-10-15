import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxItems;

    public Network(String name, int maxItems){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.maxItems = maxItems;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public String connect(IConnect device){
        if (maxItems <= deviceCount()) {
            devices.add(device);
            return "Device added";
        } else {
            return "Maximum number of devices connected";
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int getFreeSlots() {
        return maxItems - deviceCount();
    }
}