public class Radio {

    private String station;

    public Radio(String station){
        this.station = station;
    }

    public String getStation() {
        return this.station;
    }

    public String tune(String station){
        this.station = station;
        return this.getStation();
    }


}
