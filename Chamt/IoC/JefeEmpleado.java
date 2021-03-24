package Chamt.IoC;

public class JefeEmpleado implements Empleados {
	
	public JefeEmpleado(Creacioninformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private Creacioninformes informeNuevo;
	
	public String getTareas() {
		return"Gestionar las cuestiones de los empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con rectificaciones: " + informeNuevo.getInforme();
	}

}
