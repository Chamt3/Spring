package Chamt.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion de obj tipo empleado
		
		//Empleados Empleado1= new DirectorEmpleado();
		
		//uso de esos obj
		
	//	System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Empleados Juan = contexto.getBean("miempleado",Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		
		contexto.close();
		
	}

}
