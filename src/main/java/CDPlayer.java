public class CDPlayer extends Components {

    private int numberOfCDs;


    public CDPlayer(int numberOfCDs, String make, String model){
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return this.numberOfCDs;
    }

    public String play(){
        return "Now playing";
    }

    public String getMake(){
        return this.make;
    }
}
