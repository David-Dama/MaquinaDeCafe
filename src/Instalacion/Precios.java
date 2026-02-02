package src.Instalacion;

public class Precios {
    //Atributos
    private double precioCafeConLeche ;
    private double precioCafeExpresso ;
    private double precioCafeLargo ;
    private double precioChocolate ;
    private double precioTe ;
    
    //Constructor
    public Precios(double precioCafeConLeche, double precioCafeExpresso, double precioCafeLargo, double precioChocolate, double precioTe) {
        this.precioCafeConLeche = precioCafeConLeche;
        this.precioCafeExpresso = precioCafeExpresso;
        this.precioCafeLargo = precioCafeLargo;
        this.precioChocolate = precioChocolate;
        this.precioTe = precioTe;
    }
    
    //Getters y setters
    
    public double getPrecioCafeExpresso() {
        return precioCafeExpresso;
    }
    
    public void setPrecioCafeExpresso(double precioCafeExpresso) {
        this.precioCafeExpresso = precioCafeExpresso;
    }
    
    public double getPrecioCafeConLeche() {
        return precioCafeConLeche;
    }
    
    public void setPrecioCafeConLeche(double precioCafeConLeche) {
        this.precioCafeConLeche = precioCafeConLeche;
    }
    
    public double getPrecioCafeLargo() {
        return precioCafeLargo;
    }
    
    public void setPrecioCafeLargo(double precioCafeLargo) {
        this.precioCafeLargo = precioCafeLargo;
    }
    
    public double getPrecioChocolate() {
        return precioChocolate;
    }
    
    public void setPrecioChocolate(double precioChocolate) {
        this.precioChocolate = precioChocolate;
    }
    
    public double getPrecioTe() {
        return precioTe;
    }
    
    public void setPrecioTe(double precioTe) {
        this.precioTe = precioTe;
    }
}
