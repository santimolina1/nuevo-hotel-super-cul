package Logica;

import java.util.HashMap;

public  class Plato implements Servicio {
	
	CargadorArchivo cargador=CargadorArchivo.getInstance();
    private float precio;
    private String horariosDeDisponibilidad;
    private boolean llevable;
	private String nombre;
	public HashMap<String, Plato> platos= cargador.getPlatos();
    
	
	
    // Constructor
    public Plato(String producto, float precio, String tiempo, boolean llevable) {
        this.nombre = producto;
        this.precio = (float) precio;
        this.horariosDeDisponibilidad = tiempo;
        this.llevable = llevable;
    
}


	public boolean isLlevable() {
		return llevable;
	}


	@Override
	public String getNombre() {
		
		return nombre;
	}

	@Override
	public String getUbicacion() {
					return "Restaurante";
	}

	@Override
	public float getPrecioTotal() {
		
		return precio;
	}

	@Override
	public String[] getDias() {
		String[] dias= {"lunes","martes","miercoles","jueves", "viernes","sabado","domingo"};
		return dias;
	}

	@Override
	public String getHorariosDeDisponibilidad() {
		
		return horariosDeDisponibilidad;
	}}