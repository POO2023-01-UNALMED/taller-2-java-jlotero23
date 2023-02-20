package test;
public class Auto {
	String modelo,marca;
	int registro,precio,cantidadCreada;
	Motor motor;
	Asiento[] asientos;
	int cantidadAsientos() {
		int cont=0;
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i]!=null) {
				cont++;
			}
		}
		return cont;
			}
	String verificarIntegridad() {
		String mensaje="Las piezas no son originales";
		if (this.registro==motor.registro) {
			mensaje="Auto Original";
			for (Asiento asiento: this.asientos) {
				if (asiento!=null) {
					if(asiento.registro!=this.registro) {
						mensaje= "Las piezas no son originales";
					}
				}
			}
		}
		return mensaje;
		
	}
}
