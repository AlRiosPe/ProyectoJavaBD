/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author amrio
 */
public class Articulo {

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }


    public String getCodigoArticulo() {
        return CodigoArticulo;
    }

    public void setCodigoArticulo(String CodigoArticulo) {
        this.CodigoArticulo = CodigoArticulo;
    }
    String CodigoArticulo;    
    String Nombre;
    int Costo;
    String Marca;
    String Categoria;
        
}
