package tarea;

public class carros {
	private int ruedas;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asiento_cuero, climatizador;
	private int motor;
	private int motor2;
	private int motor3;
	private String carro1;
	private String carro2;
	private String carro3;
	
	public carros() {
		
		ruedas=4;
		largo=2000;
		motor=1300;
		motor2=1600;
		motor3=1800;
		ancho=2;
		peso_plataforma=500;
	}
	
	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getMotor2() {
		return motor2;
	}

	public void setMotor2(int motor2) {
		this.motor2 = motor2;
	}

	public int getMotor3() {
		return motor3;
	}

	public void setMotor3(int motor3) {
		this.motor3 = motor3;
	}

	public String getCarro1() {
		return carro1;
	}

	public void setCarro1(String carro1) {
		this.carro1 = "kia";
	}

	public String getCarro2() {
		return carro2;
	}

	public void setCarro2(String carro2) {
		this.carro2 = "suzuki";
	}
	public String getCarro3() {
		return carro3;
	}

	public void setCarro3(String carro3) {
		this.carro3 = "toyota";
	}

	
	
	public void establece_color(String color_carro) {//SETER
		
		color = color_carro ;
	}
	
	public String dime_color() {
		
		return "el color del coche es " + color;
	}
	
	public void configura_asientos(String asientos_cuero) {//SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asiento_cuero=true;
			
		}else {
			
			this.asiento_cuero=false;
		}
		
	}
	public String dime_asientos() {
		
		if(asiento_cuero==true) {
			
			return "el coche tiene asientos de cuero";
		}else {
			
			return "el coche tiene asuentos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
			
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){//GETTER
		
		if(climatizador==true) {
			
			return "el coche incorpota climatizador";
			
		}else {
			return "el coche lleva aire acondicionado";
		}
	}
	
	public String dime_peso_coche(){//SETTER + GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asiento_cuero==true) {
			
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			
			peso_total=peso_total+20;
		}
		
		return "el peso del coche es " + peso_total;
		
	}
	
	public int peso_coche() {
		
		int precio_final=10000;
		
		if(asiento_cuero==true) {
			
			precio_final+=2000;
		}
		
		if(climatizador==true) {
			
			precio_final+=1500;
			
		}
		
		return precio_final;
	}
	

}
