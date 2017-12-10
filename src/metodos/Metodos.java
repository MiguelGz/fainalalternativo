/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import cliente.Cliente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author MiguelGz
 */
public class Metodos {
    
    Vector vPrincipal =new Vector();
    
        public void guardar(Cliente uncliente){
            vPrincipal.addElement(uncliente);
                                 
        }    
        
        public void guardarArchivo(Cliente cliente){
            try {
                FileWriter fw=new FileWriter("Clientes.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.print("Nombre del Titular: "+cliente.getNombre());
                pw.print("|Tarjeta :"+cliente.getNumtarjet());
                pw.print("|Vence en :"+cliente.getFechacaduca());
                pw.print("|Proviene de la Ciudad de :"+cliente.getCiudad());
                pw.print("Equipo :"+cliente.getEquipo()+"Caracteristicas :");
                pw.print("|Pantalla :"+cliente.getPantalla());
                pw.print("|Camara : "+cliente.getCamara());
                pw.print("|Procesador:"+cliente.getProcesa());
                pw.print("|Tipo de Plan: "+cliente.getPlan());
                pw.print("|Precio del Equipo :"+cliente.getPrecio());
               
                
                        }catch (Exception e){
                JOptionPane.showMessageDialog(null, e );
                
        
        }
    
     }
    
}
