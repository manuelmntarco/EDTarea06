/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edtarea06manuelmontalban;

/**
 *
 * @author Manuel
 */
public class Tarea6EDClase {
    public void calcularPrecio(double precioProducto, int numProductos){     
    double Total;
        productosMasDeTres(numProductos, precioProducto);
    } 

    private void productosMasDeTres(int numProductos, double precioProducto) {
        double Total;
        if(numProductos>3)
            precioProducto-=5;
        if (numProductos!=0){
            Total = precioProducto*DESCUENTOMASDETRES;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto*DESCUENTOMENOSDETRES;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }
    } 
    private static final double DESCUENTOMENOSDETRES = 0.95;
    private static final double DESCUENTOMASDETRES = 0.8;
}
