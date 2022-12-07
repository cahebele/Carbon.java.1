package PegadaDeCarbono;

public class Carro implements CarbonFootprint {
	double combutivel;
	double KmRodado;
   

    public  Carro(double combutivel, double KmRodado){
    	this.combutivel = combutivel;
    	this.KmRodado = KmRodado;
    }

    public double getCombutivel(){
        return combutivel;
    }

    public void  setCombutivel(double combutivel){
        this.combutivel = combutivel;
    }
    public double getKmRodado() {
        return KmRodado;
    }

    public void setKmRodado(int KmRodado) {
        this.KmRodado = KmRodado;
    }
 

    @Override
    public double getCarbonFootprint() {
    	return combutivel / KmRodado;
    }

    public String toString(){
        return   "Um Carro com: " + combutivel + " litros de combustivel ao rodar " + KmRodado + " Quilometros" ;
    }

}
