package ar.edu.unlp.objetos.uno.Ejercicio5;


public class CarRental extends Product {
    private double cost;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
    	super(timePeriod);
        this.cost = cost;
        this.company = company;
    }
    
    public double price() {
        return this.company.calcularPrecio();
    }	//MOVE METHOD DEL MÉTODO ANTERIOR A COMPANY
  
    public double cost() {
        return this.cost;
    }

	public double getCost() {
		return cost;
	}

	
    
    
    
    
}
