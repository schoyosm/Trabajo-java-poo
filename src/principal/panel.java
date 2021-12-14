package principal;

import java.util.Scanner;
public abstract class panel {
	protected int peso,distancia,hora, conca;
	Scanner ingre = new Scanner (System.in);
	
	public void domicilio() {
		int num = 0;
		int selec = 0;
		do {
			System.out.println("Selecciones un Rol:");
			System.out.println(		"1.Usuario");
			System.out.println(		"2.Repartidor");
			System.out.println(     "3.Salir");
			selec = ingre.nextInt();
			
			
			/*condicional eleccion*/
			if(selec >= 1 && selec <= 3) {
				num=1;
			}else {
				System.out.println("Opcion no disponible");
			}
			
		}while(num==0);
		
		if(selec == 1) {
			panel obj=new usuario();
			obj.conca();
		}else if(selec == 2) {
			
		}else if(selec == 3) {
			System.out.println("¡Usted a terminado sesion!");
			
		}
	}
	
	/*Creacion de metodos sobre atributos del pedido*/
	
	/*public void Peso() {
		peso=ingre.nextInt();
	}
	public void Distancia() {
		distancia=ingre.nextInt();
	}
	public void Hora() {
		hora=ingre.nextInt();
	}
	*/
	
	/*Metodos de override*/
	public abstract void conca();
}
