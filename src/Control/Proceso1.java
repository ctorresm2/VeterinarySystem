/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Clientes;
import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Proceso1 {
    String ruta="Documentos\\bd_clientes.txt";
    FileWriter fw;    
    FileReader fr;
    BufferedReader br;
    
    public ArrayList<Clientes> array = new ArrayList();
    
    
    public void insertar(Clientes e) throws FileNotFoundException, IOException{
        fw = new FileWriter(ruta,true);
        fw.write(e.getCliente()+"-"+e.getMascota()+"-"+e.getEdad()+"-"+e.getTipo()+"\n");
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
        array.add(new Clientes(vec[0],vec[1],Integer.parseInt(vec[2]),vec[3]));
        cad=br.readLine();
        }
        fr.close();
    }
}
