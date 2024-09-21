public class GasBurner extends Burner{
    
    private String gasType;

    public GasBurner(double maxTemp, double minTemp, double diameter){
        super(maxTemp, minTemp, diameter);
    }
    public boolean spark(){
        return false;
    }
    public String getGasType(){
        return "";
    }
    private void increaseGasFlow(){

    }
    private void decreaseGasFlow(){

    }
} 

