package com.CL.acero.model; // PAQUETE QUE CONTIENE EL MODELO

import jakarta.persistence.*; // IMPORTACIÓN DE ANOTACIONES DE JPA
import java.util.Objects; // IMPORTACIÓN DE LA CLASE OBJECTS PARA IGUALDAD Y CÓDIGO HASH

/**
 * CLASE QUE REPRESENTA LA ENTIDAD ENTREGADEVOLUCION EN LA BASE DE DATOS.
 *
 * @AUTHOR LEO
 * @AUTHOR CAYE
 */
@Entity // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UNA ENTIDAD JPA
@Table(name = "entrega_devolucion") // NOMBRE DE LA TABLA EN LA BASE DE DATOS
public class EntregaDevolucion {

    @Id // ANOTACIÓN QUE INDICA QUE ESTE CAMPO ES LA CLAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ESTRATEGIA DE GENERACIÓN AUTOMÁTICA DEL ID
    private Long idEntregaDevolucion; // ID DE LA ENTREGA O DEVOLUCIÓN

    private String tipoOperacion; // "ENTREGA" O "DEVOLUCION"
    private Long productoId; // ID DEL PRODUCTO ASOCIADO

    // GETTERS Y SETTERS
    public Long getId() {
        return idEntregaDevolucion;  // CAMBIADO PARA USAR UN MÉTODO ESTÁNDAR
    }

    public void setId(Long id) {
        this.idEntregaDevolucion = id;  // CAMBIADO PARA USAR UN MÉTODO ESTÁNDAR
    }

    public String getTipoOperacion() {
        return tipoOperacion; // RETORNA EL TIPO DE OPERACIÓN
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion; // ESTABLECE EL TIPO DE OPERACIÓN
    }

    public Long getProductoId() {
        return productoId; // RETORNA EL ID DEL PRODUCTO
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId; // ESTABLECE EL ID DEL PRODUCTO
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // COMPARA REFERENCIAS
        if (!(o instanceof EntregaDevolucion)) return false; // VERIFICA SI O ES UNA INSTANCIA DE ENTREGADEVOLUCION
        EntregaDevolucion that = (EntregaDevolucion) o; // CASTEA O A ENTREGADEVOLUCION
        return Objects.equals(idEntregaDevolucion, that.idEntregaDevolucion); // COMPARA IDs
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEntregaDevolucion); // RETORNA CÓDIGO HASH DEL ID
    }
}
