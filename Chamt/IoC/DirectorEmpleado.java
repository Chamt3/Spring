package Chamt.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacioninforme (interfaz)
	
	private Creacioninformes informeNuevo;
	
	//creacion constructor de inyeccion de dependencia
	
	public DirectorEmpleado(Creacioninformes informeNuevo)
	{
		this.informeNuevo=informeNuevo;
		
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director : " + informeNuevo.getInforme();
	}
	

}
