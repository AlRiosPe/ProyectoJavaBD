/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author amrio
 */
public class ProyectoFInal {
    
    public static ArrayList<Articulo> ListaArticulos;
    public static ArrayList<Almacen> ListaAlmacen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal oPrincipal = new Principal();
        oPrincipal.setVisible(true);
        ListaAlmacen = new ArrayList<>();
        ListaArticulos = new ArrayList<>();
        // TODO code application logic here
    }
    
}
