
package Control;

import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Proceso {
    String ruta="Documentos\\bd_usuarios.txt";
    FileWriter fw;    
    FileReader fr;
    BufferedReader br;
    
    public ArrayList<Usuario> array = new ArrayList();
    
    
    public void insertar(Usuario e) throws FileNotFoundException, IOException{
        fw = new FileWriter(ruta,true);
        fw.write(e.getNombre()+"-"+e.getUsuario()+"-"+e.getContraseña()+"-"+e.getPermisos()+"\n");
        fw.close();
    }
    
    public void leer()throws FileNotFoundException, IOException{
        array.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String [] vec;
        while(cad!=null){
        vec = cad.split("-");
        array.add(new Usuario(vec[0],vec[1],vec[2],vec[3]));
        cad=br.readLine();
        }
        fr.close();
    }
     
}
