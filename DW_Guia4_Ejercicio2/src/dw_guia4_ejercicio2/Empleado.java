
package dw_guia4_ejercicio2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Empleado {
    private int id_empleado;
    private int dni;
    private String apellido;
    private String nombre;
    private int acceso;
    private boolean estado = true;

    public Empleado(int dni, String apellido, String nombre, int acceso) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.acceso = acceso;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAcceso() {
        return acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void cargarEmpleado(Conexion con){
        try {
            String agregarEmpleado = "INSERT INTO empleado (dni, apellido, nombre, acceso, estado) "
                    + "VALUES ('"+dni+"','"+apellido+"', '"+nombre+"', '"+acceso+"', '"+estado+"')";
            PreparedStatement ps = con.conectar().prepareStatement(agregarEmpleado);
            int registro = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empledado cargado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar empleado");
        }
            
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", acceso=" + acceso + ", estado=" + estado + '}';
    }
    
    
      
            
    
}
