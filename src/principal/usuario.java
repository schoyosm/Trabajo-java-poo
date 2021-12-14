package principal;

import java.util.Scanner;

public class usuario extends panel {
	Scanner log = new Scanner (System.in);
	Scanner registro = new Scanner (System.in);
	@Override
	public void conca() {
		int num = 0;
		int selec = 0;
		do {
			System.out.println("Seleccione que desea hacer");
			System.out.println(		"1.Registrar");
			System.out.println(		"2.Hacer pedido");
			System.out.println(     "3.Salir");
			selec = log.nextInt();
			
			
			/*condicional eleccion*/
			if(selec >= 1 && selec <= 3) {
				num=1;
			}else {
				System.out.println("Opcion no disponible");
			}
			
		}while(num==0);
		
		if(selec == 1) {
			//Registro//
			registro_usuario a[]=new registro_usuario[1];
			String nombre ="";
			int documento=0;
			int telefono=0;
			char direccion=' ';
			
			for(int i=0;i<a.length;i++) {
				System.out.print("Ingresa tu nombre ");
				nombre=registro.nextLine();
				System.out.print("Ingresa tu documento ");
				documento=registro.nextInt();
				System.out.print("Ingresa tu telefono ");
				telefono=registro.nextInt();
				System.out.print("Ingresa tu direccion");
				direccion=registro.next().charAt(6);
				registro.nextLine();
				//La utilidad de la sobrecarga//
				a[i]=new registro_usuario(nombre,documento,telefono,direccion);
						
			}
		}else if(selec == 2) {
			
		}else if(selec == 3) {
			
		}
		
	}
}
