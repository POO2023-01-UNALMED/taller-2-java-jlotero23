package test;
public class Motor {
	int numeroCilindros,registro;
	String tipo;
	void cambiarRegistro(int registro) {
		this.registro= registro;
	}
	
	void asignarTipo(String tipo) {
		tipo=tipo.toLowerCase();
		if ((tipo.equals("gasolina"))||(tipo.equals("electrico"))){
			this.tipo=tipo;
		}
	}

}
