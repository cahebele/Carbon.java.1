package PegadaDeCarbono;

public class Bicicleta implements CarbonFootprint {
	int marcha;
	double KmRodado;

    public Bicicleta(int marcha, double KmRodado){
    	this.marcha = marcha;
    	this.KmRodado = KmRodado;
    }
    
    public int getMarcha(){
        return marcha;
    }

    public void  setMarcha(int marcha){
        this.marcha = marcha;
    }
    
    public double getKmRodado() {
        return KmRodado;
    }

    public void setKmRodado(int KmRodado) {
        this.KmRodado = KmRodado;
    }

    @Override
    public double getCarbonFootprint() {
        return marcha / KmRodado;
    }

    public String toString(){
        return  "Uma bicicleta com: " + marcha + " marchas ao rodar " + KmRodado + " Quilometros " ;
    }
}


