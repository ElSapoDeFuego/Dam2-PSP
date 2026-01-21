package practicas.Actividad2_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Fichero {
	private File archivo;

	public Fichero(File archivo) {
		super();
		this.archivo = archivo;
	}

	public void reescribirFichero() {
		synchronized (archivo) {
			try (PrintWriter pw = new PrintWriter(new FileWriter(archivo));) {

				String linea = String.valueOf(LocalDateTime.now());
				pw.print(linea);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void leerFichero() {
		synchronized (archivo) {
			try (BufferedReader bf = new BufferedReader(new FileReader(archivo));) {
				String linea;
				while ((linea = bf.readLine()) != null) {
					System.out.println(linea);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

}
