/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.repository; // PAQUETE QUE CONTIENE LOS REPOSITORIOS

import com.CL.acero.model.Producto; // IMPORTA LA CLASE Producto
import org.springframework.data.jpa.repository.JpaRepository; // IMPORTA LA INTERFAZ JpaRepository
import java.util.List; // IMPORTA LA CLASE LISTA
import org.springframework.stereotype.Repository; // IMPORTA LA ANOTACIÓN Repository

/**
 * INTERFAZ DE REPOSITORIO PARA LA ENTIDAD Producto.
 * PROPORCIONA OPERACIONES CRUD PARA LA ENTIDAD Producto.
 *
 * @author Leo
 * @author Caye
 */
@Repository // ANOTACIÓN QUE INDICA QUE ESTA INTERFAZ ES UN REPOSITORIO DE SPRING
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    /**
     * BUSCA PRODUCTOS POR NOMBRE.
     *
     * @param nombre NOMBRE DEL PRODUCTO A BUSCAR
     * @return LISTA DE Producto QUE COINCIDEN CON EL NOMBRE
     */
    List<Producto> findByNombre(String nombre);
}
