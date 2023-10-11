/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author amrio
 */
public class Almacen extends Articulo {

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getCodigoArticulo() {
        return CodigoArticulo;
    }

    public void setCodigoArticulo(String CodigoArticulo) {
        this.CodigoArticulo = CodigoArticulo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

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
    String Ubicacion;
    int Stock;
    String SKU;
    
}
