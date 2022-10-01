package tarea;


import javax.swing.JOptionPane;


public class application {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		carros miCarro = new carros();
		
		int intentos=0;
		
		System.out.println("escoge la opciòn: \n1: Comprar carro.\n2: salir");
		
		int option=Integer.parseInt(JOptionPane.showInputDialog("eliger tu opciòn"));
		
		switch(option) {
		
		case 1 :
			intentos++;
			
			System.out.println("_Que modelo de carro prefieres o deseas salir salir: \n1:kia. \n2:Suzuki. \n3:toyota. \n4:salir.");
			
			int modelo=Integer.parseInt(JOptionPane.showInputDialog("elige tu modelo indicado."));
			
			switch(modelo) {
			case 1 :
			miCarro.establece_color(JOptionPane.showInputDialog("introduce el color para tu carro"));
		
			System.out.println(miCarro.dime_color());
		
			miCarro.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero si, no?"));
		
			miCarro.getCarro1();	
			
			System.out.println(miCarro.dime_asientos());
		
			miCarro.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
		
			System.out.println(miCarro.dime_climatizador());
		
			System.out.println(miCarro.dime_peso_coche());
		
			System.out.println(" tu carro es de marca " + " precio final del coche es : kia " + miCarro.peso_coche() + " con un motor " + miCarro.getMotor2());
		
			break;
			
			case 2:
				
				miCarro.establece_color(JOptionPane.showInputDialog("introduce el color para tu carro"));
			
				System.out.println(miCarro.dime_color());
			
				miCarro.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero si, no?"));
			
				System.out.println(miCarro.dime_asientos());
			
				miCarro.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
			
				System.out.println(miCarro.dime_climatizador());
			
				System.out.println(miCarro.dime_peso_coche());
			
				System.out.println("el modelo de tu coche es un "
						+ ""  + "precio final del coche es : " +  miCarro.getCarro2() + miCarro.peso_coche() + " con un motor " + miCarro.getMotor3());
				
				break;
			case 3:
				
				miCarro.establece_color(JOptionPane.showInputDialog("introduce color"));
			
				System.out.println(miCarro.dime_color());
			
				miCarro.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero si, no?"));
			
				System.out.println(miCarro.dime_asientos());
			
				miCarro.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
			
				System.out.println(miCarro.dime_climatizador());
			
				System.out.println(miCarro.dime_peso_coche());
			
				System.out.println("el modelo de tu coche es un "+ miCarro.getCarro2() + "precio final del coche es : " + miCarro.peso_coche() + " con un motor " + miCarro.getMotor2());
			
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("opcion erronia, intentalo denuevo.");
				break;
			}
		
		case 2:
			
				System.exit(0);
				break;
		default:
				System.out.println("elige otra opcion");
				break;
		}System.out.println("as tenido un total de " + intentos + "movimientos."); 
	}
}
		


