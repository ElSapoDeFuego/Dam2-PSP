package practicas.ej8;

import javax.swing.JTextField;

/**
 * Para suspender de forma segura el hilo se debe introducir en el hilo una
 * vble, por ej, suspender y comprobar su valor dentro del método run(), es lo
 * que se hace en la llamada al método esperandoParaReanudar() de este código.
 * El método Suspende del hilo da valor true a la variable para suspender el
 * hilo. El método Reanuda da el valor false para que detenga la suspensión y
 * continue ejecutándose el hilo.
 **/

public class MyHilo extends Thread {

	private SolicitaSuspender suspender = new SolicitaSuspender();
	private int contador = 0;
private boolean fin = false;
private JTextField texto = new JTextField();

	public MyHilo(JTextField texto) {
	super();
	this.texto = texto;
}

	public void Suspende() {
		suspender.set(true);// petición de suspender hilo
	}

	public void Reanuda() {
		suspender.set(false);// petición de continuar
	}

	public void run() {
		try {
			while (!fin) {
				suspender.esperandoParaReanudar();// comprobar
				contador++;
				devolverValorContador();
				this.sleep(1000);
			}
			System.out.println("fin del bucle");
		} catch (InterruptedException exception) {
		}
	}
	public void devolverValorContador () {
		texto.setText(Integer.toString(getContador()));
		
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public JTextField getTexto() {
		return texto;
	}

	public void setTexto(JTextField texto) {
		this.texto = texto;
	}
	
	

}
