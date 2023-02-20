package test;
//Asiento
public class Asiento {
	
	String color;
	int precio;
	int registro;
	String[] colores = {"negro","blanco","rojo","verde","amarillo"};
	void cambiarColor(String color) {
		color=color.toLowerCase();
		for (int i=0;i<colores.length;i++) {
			if(color.equals(colores[i])) {
				this.color = color;
				break;
			}
		}
		
	}
}

