package ar.strellis.ejemplospatrones.abstractfactory;

public class BarajaEspanola extends Baraja
{
	public enum Palo {
		OROS,
		BASTOS,
		ESPADAS,
		COPAS
	}
	public enum Numero {
		AS,
		DOS,
		TRES,
		CUATRO,
		CINCO,
		SEIS,
		SIETE,
		OCHO,
		NUEVE,
		SOTA,
		CABALLO,
		REY
	}

	@Override
	public Carta crearCarta(String palo, String numero)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
