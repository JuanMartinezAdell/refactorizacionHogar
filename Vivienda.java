
package Hogar;


public class Vivienda 
{	
	/**Atributos*/x-special/nautilus-clipboard
	copy
	file:///home/adell/Im%C3%A1genes/Captura%20de%20pantalla%20de%202021-05-19%2017-43-40.png

	
    private double precio;
    private int numHabitaciones;
    private  double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**Constructores*/
    
    /*******************************
     * Constructor
     * 
     * @param precio
     * 
     *******************************/
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /******************************************
     * 
     * Constructor con todos los parametros
     * 
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario
     * 
     ********************************************/
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
		super();
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.superficie = superficie;
		this.parking = parking;
		this.estado = estado;
		this.propietario = propietario;
	}

	
    
    /**Getters y Setters*/
    
    public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
    

    
    
    /**Metodos*/
	
	
	/**Metodo actuializar precio*/
    
    public double actualizarPrecio(double descuento)
    {
        return  precio = (precio-descuento)*0.5;
    }
    

	
    /**Metodo imprmirVivienda*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("\n\t---Vivienda---\n");
		builder.append("\n\tPrecio de la vivienda: ");
		builder.append(precio);
		builder.append("\n\tNumHabitaciones=");
		builder.append(numHabitaciones);
		builder.append("\n\tSuperficie=");
		builder.append(superficie);
		builder.append("\n\tParking=");
		builder.append(parking);
		builder.append("\n\tEstado=");
		builder.append(estado);
		builder.append("\n\tPropietario=");
		builder.append(propietario);
		return builder.toString();
	}

	
    
    
    
}
