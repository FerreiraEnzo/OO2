package ar.edu.unlp.objetos.uno.Ejercicio5;


public class HotelStay extends Product {
    private double quote;
    private Hotel hotel;

    public HotelStay(double quote, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod);
        this.quote = quote;
        this.hotel = hotel;
    }

    public double priceFactor() {
        return this.quote / this.price();
    }

    public double price() {
        return this.timePeriod.duration() * this.hotel.calculoPrecio();
    }

	public double getQuote() {
		return quote;
	}

	public void setQuote(double quote) {
		this.quote = quote;
	}
    
    
    
    
}
