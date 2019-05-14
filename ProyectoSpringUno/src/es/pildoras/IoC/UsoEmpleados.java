package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// Creacion de objetos de tipo empleado
		/*Empleados empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());*/
		//Crear contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Pedirle a archivo xml el objeto
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		//utilizar el objeto
		System.out.println(Juan.getTareas());
		//cerrar contexto
		contexto.close();
	}

}
