package ar.strellis.ejemplospatrones.factorymethod;

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
	public Carta crearCarta(String palo,String numero)
	{
		return new CartaEspanola(BarajaEspanola.Palo.valueOf(palo),BarajaEspanola.Numero.valueOf(numero));
	}
}
