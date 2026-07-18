package ar.edu.unlp.objetos.uno.Ejercicio5;

public class Company {
    private final double price;
    private final double promotionRate;

    public Company(double price, double promotionRate) {
        this.price = price;
        this.promotionRate = promotionRate;
    }

    public double price() {
        return this.price;
    }

    public double promotionRate() {
        return this.promotionRate;
    }
    
    
    public double calcularPrecio() {
        return this.price() * this.promotionRate();
    }	 
    
    
    
    
}
