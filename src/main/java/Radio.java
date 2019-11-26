public class Radio extends Components {

    private String station;

    public Radio(String station, String make, String model){
        super(make,model);
        this.station = station;

    }

    public String getStation() {
        return this.station;
    }

    public String tune(String station){
        this.station = station;
        return this.getStation();
    }

    public String play(){
        return "Now playing";
    }


}
