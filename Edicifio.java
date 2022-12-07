package PegadaDeCarbono;

public class Edicifio implements CarbonFootprint {
    double gas;
    int moradores;

    public Edicifio(double gas, int moradores){
    	this.gas = gas;
        this.moradores = moradores;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getMoradores() {
        return moradores;
    }

    public void setMoradores(int moradores) {
        this.moradores = moradores;
    }


    @Override
    public double getCarbonFootprint() {
        return  gas / moradores;
    }
    public String toString(){ 
        return  "Cada morador consume o total de gás: " + gas + " mensal";		
    }

}
