package act_1_2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo3 {
    public static void main (String[] args) throws IOException{
        //proceso a ejecutar es Ejemplo2
        Process p = new ProcessBuilder("java","ProgramaInexistente").start();//java es el comando para ejecutar un class

        //obtener la salida
        try {
            InputStream ip = p.getErrorStream();
            int c;
            while ((c = ip.read())!=-1){
                System.out.print((char) c);
            }
            ip.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }    
    }
}

