public abstract class Components {
    protected String make;
    protected String model;
    protected Boolean power;

    public Components(String make, String model){
        this.make = make;
        this.model = model;
        this.power = power;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public Boolean power(){
        return power;
    }

    public void powerOn(){
        this.power = true;
    }

    public void powerOff(){
        this.power = false;
    }
}
