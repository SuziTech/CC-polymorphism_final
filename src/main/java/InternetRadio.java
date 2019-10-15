public class InternetRadio implements IConnect{

    private String station;

    public InternetRadio(String station) {
        this.station = station;
    }

    public String getStation() {
        return this.station;
    }

    public void tune(String newStation) {

        this.station = newStation;
    }

    public String connect(String data) {
        return "connected to " + data + " network";
    }
}
