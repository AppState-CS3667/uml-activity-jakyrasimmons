public class ElectricBurner extends Burner{
    
    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq, double maxTemp, double minTemp, double diameter){
        super(maxTemp, minTemp, diameter);
        this.voltReq = voltReq;
    }
    public void increaseCurrent(){

    }
    public void decreaseCurrent(){
        
    }
    public double getVoltReq(){
        return 0.0;
    }
}