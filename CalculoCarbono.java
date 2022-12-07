package PegadaDeCarbono;

public class CalculoCarbono {
	
	public static void main(String[] args) {
	CarbonFootprint Bicicleta = new Bicicleta(12, 50 );
	CarbonFootprint Edicifio = new Edicifio(150.40, 10);
    CarbonFootprint Carro = new Carro(40, 45.000);
    
    System.out.println(Bicicleta + "\nEmite: " + Bicicleta.getCarbonFootprint() + " de carbono. \n");
    System.out.println(Edicifio + "\nEmite: " + Edicifio.getCarbonFootprint() + " de carbono. \n");
    System.out.println(Carro + "\nEmite: " + Carro.getCarbonFootprint() + " de carbono. \n");
	}
}
