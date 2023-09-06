
package dw_guia4_ejercicio2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Herramienta {
    private int id_herramienta;
    private String nombre;
    private String descripcion;
    private int stock;
    private boolean estado = true;

    public Herramienta(String nombre, String descripcion, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
       
    }

    public int getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
    public void cargarHerramienta(Conexion con){
        try {
            String agregarHerramienta = "INSERT INTO empleado (nombre, descripcion, stock, estado) "
                    + "VALUES ('"+nombre+"','"+descripcion+"', '"+stock+"', '"+estado+"')";
            PreparedStatement ps = con.conectar().prepareStatement(agregarHerramienta);
            int registro = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Herramienta cargada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la herramienta");
        }
     
    }

    @Override
    public String toString() {
        return "Herramientas{" + "id_herramienta=" + id_herramienta + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
    
    
}
