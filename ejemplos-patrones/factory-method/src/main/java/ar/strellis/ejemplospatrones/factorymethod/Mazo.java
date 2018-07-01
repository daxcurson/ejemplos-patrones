package ar.strellis.ejemplospatrones.factorymethod;

public class Mazo
{
	private Baraja baraja;

	public Mazo(Baraja baraja)
	{
		this.baraja=baraja;
	}
	
	public static void main(String[] args)
	{
		Mazo m=new Mazo(new BarajaEspanola());
		m.generarCartas();
	}

	private void generarCartas()
	{
		System.out.println("Saco un rey de bastos");
		Carta carta1=baraja.crearCarta("BASTOS", "REY");
		System.out.println("Saque esta carta: "+carta1);
	}
}
