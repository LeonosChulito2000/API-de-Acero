/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.service; // PAQUETE QUE CONTIENE LOS SERVICIOS

import com.CL.acero.model.Producto; // IMPORTA LA CLASE Producto
import com.CL.acero.model.EntregaDevolucion; // IMPORTA LA CLASE EntregaDevolucion
import com.CL.acero.model.OrdenCompra; // IMPORTA LA CLASE OrdenCompra
import com.CL.acero.model.ResponseCode; // IMPORTA LA CLASE ResponseCode
import org.springframework.stereotype.Service; // IMPORTA LA ANOTACIÓN Service

import java.util.ArrayList; // IMPORTA LA CLASE ArrayList
import java.util.List; // IMPORTA LA CLASE LISTA
import java.util.Optional; // IMPORTA LA CLASE Optional

/**
 * CLASE DE SERVICIO QUE CONTIENE LA LÓGICA DE NEGOCIO PARA GESTIONAR PRODUCTOS,
 * ÓRDENES DE COMPRA, ENTREGAS Y DEVOLUCIONES.
 *
 * @author Leo
 * @author Caye
 */
@Service // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UN SERVICIO DE SPRING
public class AceroService {

    // SIMULANDO UNA BASE DE DATOS TEMPORAL CON UNA LISTA DE PRODUCTOS
    private List<Producto> productos = new ArrayList<>();

    // OBTENER TODOS LOS PRODUCTOS
    public List<Producto> obtenerProductos() {
        return productos; // DEVUELVE LA LISTA DE PRODUCTOS
    }

    // CREAR UN NUEVO PRODUCTO
    public ResponseCode crearProducto(Producto producto) {
        productos.add(producto); // AGREGA EL PRODUCTO A LA LISTA
        return new ResponseCode(201, "Producto creado exitosamente"); // RETORNA CÓDIGO DE RESPUESTA
    }

    // OBTENER UN PRODUCTO POR SU ID
    public Optional<Producto> obtenerProductoPorId(String id) {
        return productos.stream() // CONVIERTE LA LISTA EN UN FLUJO
                .filter(p -> p.getIdProducto().equals(id)) // FILTRA POR ID
                .findFirst(); // DEVUELVE EL PRIMER PRODUCTO QUE COINCIDA
    }

    // ACTUALIZAR UN PRODUCTO POR SU ID
    public ResponseCode actualizarProducto(String id, Producto productoActualizado) {
        Optional<Producto> productoExistente = obtenerProductoPorId(id); // BUSCA EL PRODUCTO EXISTENTE
        if (productoExistente.isPresent()) { // SI SE ENCUENTRA EL PRODUCTO
            Producto p = productoExistente.get(); // OBTIENE EL PRODUCTO
            // ACTUALIZA LOS CAMPOS DEL PRODUCTO
            p.setNombre(productoActualizado.getNombre());
            p.setCalibre(productoActualizado.getCalibre());
            p.setImpurezas(productoActualizado.getImpurezas());
            p.setToneladasDisponibles(productoActualizado.getToneladasDisponibles());
            p.setSolicitudesPendientes(productoActualizado.getSolicitudesPendientes());
            return new ResponseCode(200, "Producto actualizado exitosamente"); // RETORNA CÓDIGO DE ÉXITO
        }
        return new ResponseCode(404, "Producto no encontrado"); // RETORNA CÓDIGO DE NO ENCONTRADO
    }

    // ELIMINAR UN PRODUCTO POR SU ID
    public ResponseCode eliminarProducto(String id) {
        Optional<Producto> producto = obtenerProductoPorId(id); // BUSCA EL PRODUCTO
        if (producto.isPresent()) { // SI SE ENCUENTRA EL PRODUCTO
            productos.remove(producto.get()); // ELIMINA EL PRODUCTO DE LA LISTA
            return new ResponseCode(200, "Producto eliminado exitosamente"); // RETORNA CÓDIGO DE ÉXITO
        }
        return new ResponseCode(404, "Producto no encontrado"); // RETORNA CÓDIGO DE NO ENCONTRADO
    }

    // REGISTRAR UNA NUEVA ORDEN DE COMPRA
    public ResponseCode registrarOrdenCompra(OrdenCompra ordenCompra) {
        // LÓGICA PARA REGISTRAR LA ORDEN DE COMPRA
        return new ResponseCode(201, "Orden de compra registrada exitosamente"); // RETORNA CÓDIGO DE ÉXITO
    }

    // REGISTRAR ENTREGA O DEVOLUCIÓN
    public ResponseCode registrarEntregaDevolucion(EntregaDevolucion entregaDevolucion) {
        // LÓGICA PARA REGISTRAR ENTREGA O DEVOLUCIÓN
        if ("entrega".equalsIgnoreCase(entregaDevolucion.getTipoOperacion())) {
            return new ResponseCode(201, "Entrega registrada exitosamente"); // RETORNA CÓDIGO DE ÉXITO
        } else if ("devolucion".equalsIgnoreCase(entregaDevolucion.getTipoOperacion())) {
            return new ResponseCode(201, "Devolución registrada exitosamente"); // RETORNA CÓDIGO DE ÉXITO
        }
        return new ResponseCode(400, "Tipo de operación no válido"); // RETORNA CÓDIGO DE ERROR
    }
}
