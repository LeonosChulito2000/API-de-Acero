/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.repository; // PAQUETE QUE CONTIENE LOS REPOSITORIOS

import com.CL.acero.model.EntregaDevolucion; // IMPORTA LA CLASE EntregaDevolucion
import java.util.List; // IMPORTA LA CLASE LISTA
import org.springframework.data.jpa.repository.JpaRepository; // IMPORTA LA INTERFAZ JpaRepository
import org.springframework.stereotype.Repository; // IMPORTA LA ANOTACIÓN Repository

/**
 * INTERFAZ DE REPOSITORIO PARA LA ENTIDAD EntregaDevolucion.
 * PROPORCIONA OPERACIONES CRUD PARA LA ENTIDAD EntregaDevolucion.
 *
 * @author Leo
 * @author Caye
 */
@Repository // ANOTACIÓN QUE INDICA QUE ESTA INTERFAZ ES UN REPOSITORIO DE SPRING
public interface EntregaDevolucionRepository extends JpaRepository<EntregaDevolucion, Long> {
        /**
     * BUSCA ENTREGA O DEVOLUCIONES POR TIPO DE OPERACIÓN.
     *
     * @param tipoOperacion TIPO DE OPERACIÓN A BUSCAR ("entrega" O "devolución")
     * @return LISTA DE EntregaDevolucion QUE COINCIDEN CON EL TIPO DE OPERACIÓN
     */
    List<EntregaDevolucion> findByTipoOperacion(String tipoOperacion);
}
