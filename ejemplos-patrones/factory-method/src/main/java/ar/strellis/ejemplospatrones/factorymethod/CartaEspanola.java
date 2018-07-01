package ar.strellis.ejemplospatrones.factorymethod;

public class CartaEspanola implements Carta
{
	private BarajaEspanola.Palo palo;
	private BarajaEspanola.Numero numero;
	public CartaEspanola(BarajaEspanola.Palo palo,BarajaEspanola.Numero numero)
	{
		this.setPalo(palo);
		this.setNumero(numero);
	}
	public BarajaEspanola.Palo getPalo()
	{
		return palo;
	}
	public void setPalo(BarajaEspanola.Palo palo)
	{
		this.palo = palo;
	}
	public BarajaEspanola.Numero getNumero()
	{
		return numero;
	}
	public void setNumero(BarajaEspanola.Numero numero)
	{
		this.numero = numero;
	}
	@Override
	public String toString()
	{
		return numero+" DE "+palo;
	}
}
