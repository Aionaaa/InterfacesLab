public class CDPlayer {

    private int numberOfCDs;

    public CDPlayer(int numberOfCDs){
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return this.numberOfCDs;
    }

    public String play() {
        return "Now playing";
    }
}
