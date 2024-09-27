
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.repository; // PAQUETE QUE CONTIENE LOS REPOSITORIOS

import com.CL.acero.model.OrdenCompra; // IMPORTA LA CLASE OrdenCompra
import org.springframework.data.jpa.repository.JpaRepository; // IMPORTA LA INTERFAZ JpaRepository
import java.util.List; // IMPORTA LA CLASE LISTA
import org.springframework.stereotype.Repository; // IMPORTA LA ANOTACIÓN Repository

/**
 * INTERFAZ DE REPOSITORIO PARA LA ENTIDAD OrdenCompra.
 * PROPORCIONA OPERACIONES CRUD PARA LA ENTIDAD OrdenCompra.
 *
 * @author Leo
 * @author Caye
 */
@Repository // ANOTACIÓN QUE INDICA QUE ESTA INTERFAZ ES UN REPOSITORIO DE SPRING
public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Long> {
    /**
     * BUSCA ORDENES DE COMPRA POR ESTADO.
     *
     * @param estado ESTADO DE LA ORDEN DE COMPRA A BUSCAR
     * @return LISTA DE OrdenCompra QUE COINCIDEN CON EL ESTADO
     */
    List<OrdenCompra> findByEstado(String estado);
}
