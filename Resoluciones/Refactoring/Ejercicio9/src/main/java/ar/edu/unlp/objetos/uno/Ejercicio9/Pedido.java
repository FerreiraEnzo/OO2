package ar.edu.unlp.objetos.uno.Ejercicio9;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import jdk.internal.org.jline.reader.impl.history.DefaultHistory;

public class Pedido {
	private Cliente cliente;
    private List<Producto> productos;
    private FormaPago formaPago;

    
    
    public Pedido(Cliente cliente, List<Producto> productos, FormaPago formaPago) {
        if (!"efectivo".equals(formaPago) && !"6 cuotas".equals(formaPago) && !"12 cuotas".equals(formaPago)) {
            throw new Error("Forma de pago incorrecta");
        } 
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }
    
    
    public double getCostoTotal() {
	    double costoProductos = 0;
        for (Producto producto : this.productos) {
            costoProductos += producto.getPrecio();
        }
        double extraFormaPago = 0;
        if ("efectivo".equals(this.formaPago)) {
            extraFormaPago = 0;
        } else if ("6 cuotas".equals(this.formaPago)) {
            extraFormaPago = costoProductos * 0.2;
        } else if ("12 cuotas".equals(this.formaPago)) {
            extraFormaPago = costoProductos * 0.5;
        }
        int añosDesdeFechaAlta = Period.between(this.cliente.getFechaAlta(), LocalDate.now()).getYears();
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad
        if (añosDesdeFechaAlta > 5) {
            return (costoProductos + extraFormaPago) * 0.9;
        }
        return costoProductos + extraFormaPago;
    }

	
    		//INCISO 1, 2 Y 3 

	public Pedido(Cliente cliente, List<Producto> productos, FormaPago formaPago) {
	    if (!"efectivo".equals(formaPago) && !"6 cuotas".equals(formaPago) && !"12 cuotas".equals(formaPago)) {
	        throw new Error("Forma de pago incorrecta");
	    } 
	    this.cliente = cliente;
	    this.productos = productos;
	    this.formaPago = formaPago;
	}
	
	
	
	public double getCostoTotal() {
	    double costoProductos = this.productos.stream().
	    		mapToDouble(p -> p.getPrecio())
	    		.sum();
	    double extraFormaPago = this.formaPago.calcularAdicional(costoProductos);
	    double costoFinal = this.calcularDescuento(costoProductos, extraFormaPago);
	    return costoFinal;
	}    
	
	
	public boolean esAntiguo(int antiguedad) {
		return antiguedad > 5;
	}
	
	public double calcularDescuento(double costoProductos, double extra) {
		return this.esAntiguo(this.cliente.calcularAños()) ? costoProductos * extra * 0.9 : costoProductos + extra;		
	}

}