
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.model; // PAQUETE QUE CONTIENE EL MODELO

import jakarta.persistence.*; // IMPORTACIÓN DE ANOTACIONES DE JPA PARA LA GESTIÓN DE LA BASE DE DATOS
import java.util.Objects; // IMPORTACIÓN DE LA CLASE OBJECTS PARA IGUALDAD Y CÓDIGO HASH

/**
 * CLASE QUE REPRESENTA LA ENTIDAD PRODUCTO EN LA BASE DE DATOS.
 *
 * @author Leo
 * @author Caye
 */
@Entity // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UNA ENTIDAD JPA QUE SERÁ MAPEADA A UNA TABLA EN LA BASE DE DATOS
@Table(name = "producto") // ESPECIFICA EL NOMBRE DE LA TABLA EN LA BASE DE DATOS A LA QUE ESTA CLASE ESTÁ ASOCIADA
public class Producto {

    @Id // ANOTACIÓN QUE INDICA QUE ESTE CAMPO ES LA CLAVE PRIMARIA DE LA ENTIDAD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ANOTACIÓN QUE ESPECIFICA QUE EL VALOR DEL ID SERÁ GENERADO AUTOMÁTICAMENTE POR LA BASE DE DATOS
    private Long idProducto; // ID DEL PRODUCTO

    private String nombre; // NOMBRE DEL PRODUCTO
    private String calibre; // CALIBRE DEL PRODUCTO
    private double impurezas; // PORCENTAJE DE IMPUREZAS EN EL PRODUCTO
    private double toneladasDisponibles; // CANTIDAD DE TONELADAS DISPONIBLES DEL PRODUCTO
    private int solicitudesPendientes; // NÚMERO DE SOLICITUDES PENDIENTES PARA EL PRODUCTO

    // GETTERS Y SETTERS
    public Long getIdProducto() {
        return idProducto; // RETORNA EL ID DEL PRODUCTO
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto; // ESTABLECE EL ID DEL PRODUCTO
    }

    public String getNombre() {
        return nombre; // RETORNA EL NOMBRE DEL PRODUCTO
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // ESTABLECE EL NOMBRE DEL PRODUCTO
    }

    public String getCalibre() {
        return calibre; // RETORNA EL CALIBRE DEL PRODUCTO
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre; // ESTABLECE EL CALIBRE DEL PRODUCTO
    }

    public double getImpurezas() {
        return impurezas; // RETORNA EL PORCENTAJE DE IMPUREZAS DEL PRODUCTO
    }

    public void setImpurezas(double impurezas) {
        this.impurezas = impurezas; // ESTABLECE EL PORCENTAJE DE IMPUREZAS DEL PRODUCTO
    }

    public double getToneladasDisponibles() {
        return toneladasDisponibles; // RETORNA LA CANTIDAD DE TONELADAS DISPONIBLES DEL PRODUCTO
    }

    public void setToneladasDisponibles(double toneladasDisponibles) {
        this.toneladasDisponibles = toneladasDisponibles; // ESTABLECE LA CANTIDAD DE TONELADAS DISPONIBLES DEL PRODUCTO
    }

    public int getSolicitudesPendientes() {
        return solicitudesPendientes; // RETORNA EL NÚMERO DE SOLICITUDES PENDIENTES
    }

    public void setSolicitudesPendientes(int solicitudesPendientes) {
        this.solicitudesPendientes = solicitudesPendientes; // ESTABLECE EL NÚMERO DE SOLICITUDES PENDIENTES
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // COMPARA REFERENCIAS PARA VERIFICAR SI SON EL MISMO OBJETO
        if (!(o instanceof Producto)) return false; // VERIFICA SI O ES UNA INSTANCIA DE PRODUCTO
        Producto producto = (Producto) o; // CASTEA O A PRODUCTO
        return Objects.equals(idProducto, producto.idProducto); // COMPARA LOS IDs DE LOS PRODUCTOS
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto); // RETORNA UN CÓDIGO HASH BASADO EN EL ID DEL PRODUCTO
    }
}
