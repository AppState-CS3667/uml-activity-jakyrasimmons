public abstract class Burner{

    private double diameter;
    private double maxTemp;
    private double minTemp;
    private boolean isHot;

    public Burner(double maxTemp, double minTemp, double diameter){
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;
    }
    public boolean turnOn(){
        return false;
    }
    public boolean turnOff(){
        return false;
    }
    public void increaseTemp(){

    }
    public void decreaseTemp(){

    }
    public double getDiameter(){
        return 0.0;
    }
    public double getMaxTemp(){
        return 0.0;
    }
    public double getMinTemp(){
        return 0.0;
    }
    public boolean isHot(){
        return false;
    }
}