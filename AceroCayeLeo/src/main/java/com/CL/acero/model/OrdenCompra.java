package com.CL.acero.model; // PAQUETE QUE CONTIENE EL MODELO

import jakarta.persistence.*; // IMPORTACIÓN DE ANOTACIONES DE JPA PARA LA GESTIÓN DE LA BASE DE DATOS
import java.util.Objects; // IMPORTACIÓN DE LA CLASE OBJECTS PARA IGUALDAD Y CÓDIGO HASH

/**
 * CLASE QUE REPRESENTA LA ENTIDAD ORDENCOMPRA EN LA BASE DE DATOS.
 *
 * @AUTHOR LEO
 * @AUTHOR CAYE
 */
@Entity // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UNA ENTIDAD JPA QUE SERÁ MAPEADA A UNA TABLA EN LA BASE DE DATOS
@Table(name = "orden_compra") // ESPECIFICA EL NOMBRE DE LA TABLA EN LA BASE DE DATOS A LA QUE ESTA CLASE ESTÁ ASOCIADA
public class OrdenCompra {

    @Id // ANOTACIÓN QUE INDICA QUE ESTE CAMPO ES LA CLAVE PRIMARIA DE LA ENTIDAD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ANOTACIÓN QUE ESPECIFICA QUE EL VALOR DEL ID SERÁ GENERADO AUTOMÁTICAMENTE POR LA BASE DE DATOS
    private Long idOrdenCompra; // ID DE LA ORDEN DE COMPRA

    private String productoId; // ID DEL PRODUCTO ASOCIADO A LA ORDEN
    private int cantidad; // CANTIDAD DEL PRODUCTO EN LA ORDEN
    private String estado; // ESTADO DE LA ORDEN (P. EJ. PENDIENTE, COMPLETADA, CANCELADA)

    // GETTERS Y SETTERS
    public Long getId() {
        return idOrdenCompra;  // RETORNA EL ID DE LA ORDEN DE COMPRA
    }

    public void setId(Long id) {
        this.idOrdenCompra = id;  // ESTABLECE EL ID DE LA ORDEN DE COMPRA
    }

    public String getProductoId() {
        return productoId; // RETORNA EL ID DEL PRODUCTO ASOCIADO
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId; // ESTABLECE EL ID DEL PRODUCTO
    }

    public int getCantidad() {
        return cantidad; // RETORNA LA CANTIDAD DEL PRODUCTO EN LA ORDEN
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; // ESTABLECE LA CANTIDAD DEL PRODUCTO EN LA ORDEN
    }

    public String getEstado() {
        return estado; // RETORNA EL ESTADO DE LA ORDEN
    }

    public void setEstado(String estado) {
        this.estado = estado; // ESTABLECE EL ESTADO DE LA ORDEN
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // COMPARA REFERENCIAS PARA VERIFICAR SI SON EL MISMO OBJETO
        if (!(o instanceof OrdenCompra)) return false; // VERIFICA SI O ES UNA INSTANCIA DE ORDENCOMPRA
        OrdenCompra that = (OrdenCompra) o; // CASTEA O A ORDENCOMPRA
        return Objects.equals(idOrdenCompra, that.idOrdenCompra); // COMPARA LOS IDs DE LAS ORDENES DE COMPRA
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrdenCompra); // RETORNA UN CÓDIGO HASH BASADO EN EL ID DE LA ORDEN DE COMPRA
    }
}
