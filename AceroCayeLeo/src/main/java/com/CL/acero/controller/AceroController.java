/*
 * CLICK NBFS://NBHOST/SYSTEMFILESTEMPLATES/LICENSES/LICENSE-DEFAULT.TXT TO CHANGE THIS LICENSE
 * CLICK NBFS://NBHOST/SYSTEMFILESTEMPLATES/CLASSES/CLASS.JAVA TO EDIT THIS TEMPLATE
 */
package com.CL.acero.controller; // PAQUETE QUE CONTIENE EL CONTROLADOR

// IMPORTACIÓN DE CLASES NECESARIAS
import com.CL.acero.model.Producto;
import com.CL.acero.model.EntregaDevolucion;
import com.CL.acero.model.OrdenCompra;
import com.CL.acero.model.ResponseCode;
import com.CL.acero.service.ProductoService;
import com.CL.acero.service.OrdenCompraService;
import com.CL.acero.service.EntregaDevolucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * CONTROLADOR PRINCIPAL PARA GESTIONAR PRODUCTOS, ÓRDENES DE COMPRA, ENTREGAS Y DEVOLUCIONES.
 *
 * @AUTHOR LEO
 * @AUTHOR CAYE
 */
@RestController // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UN CONTROLADOR REST
@RequestMapping("/api/acero") // RUTA BASE PARA LAS PETICIONES
public class AceroController {

    // SERVICIOS INYECTADOS
    private final ProductoService productoService;
    private final OrdenCompraService ordenCompraService;
    private final EntregaDevolucionService entregaDevolucionService;

    // CONSTRUCTOR QUE INYECTA LOS SERVICIOS
    @Autowired
    public AceroController(ProductoService productoService, 
                           OrdenCompraService ordenCompraService, 
                           EntregaDevolucionService entregaDevolucionService) {
        this.productoService = productoService; // INICIALIZA EL SERVICIO DE PRODUCTOS
        this.ordenCompraService = ordenCompraService; // INICIALIZA EL SERVICIO DE ÓRDENES DE COMPRA
        this.entregaDevolucionService = entregaDevolucionService; // INICIALIZA EL SERVICIO DE ENTREGA Y DEVOLUCIÓN
    }

    // GET: OBTENER TODOS LOS PRODUCTOS
    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productoService.obtenerTodosLosProductos(); // DEVUELVE LA LISTA DE PRODUCTOS
    }

    // POST: CREAR UN NUEVO PRODUCTO
    @PostMapping("/productos")
    public ResponseCode crearProducto(@RequestBody Producto producto) {
        productoService.crearProducto(producto); // CREAMOS EL PRODUCTO
        return new ResponseCode(201, "PRODUCTO CREADO EXITOSAMENTE"); // RETORNA CÓDIGO Y MENSAJE DE ÉXITO
    }

    // GET: OBTENER UN PRODUCTO POR SU ID
    @GetMapping("/productos/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id) // OBTENEMOS EL PRODUCTO POR ID
                .orElse(null); // RETORNA EL PRODUCTO O NULO SI NO SE ENCUENTRA
    }

    // PUT: ACTUALIZAR UN PRODUCTO POR SU ID
    @PutMapping("/productos/{id}")
    public ResponseCode actualizarProducto(@PathVariable Long id, @RequestBody Producto productoActualizado) {
        Producto producto = productoService.actualizarProducto(id, productoActualizado); // ACTUALIZA EL PRODUCTO
        return new ResponseCode(200, "PRODUCTO ACTUALIZADO EXITOSAMENTE"); // RETORNA CÓDIGO Y MENSAJE DE ÉXITO
    }

    // DELETE: ELIMINAR UN PRODUCTO POR SU ID
    @DeleteMapping("/productos/{id}")
    public ResponseCode eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id); // ELIMINA EL PRODUCTO
        return new ResponseCode(200, "PRODUCTO ELIMINADO EXITOSAMENTE"); // RETORNA CÓDIGO Y MENSAJE DE ÉXITO
    }

    // POST: REGISTRAR UNA NUEVA ORDEN DE COMPRA
    @PostMapping("/orden-compra")
    public ResponseCode registrarOrdenCompra(@RequestBody OrdenCompra ordenCompra) {
        ordenCompraService.crearOrdenCompra(ordenCompra); // CREA LA ORDEN DE COMPRA
        return new ResponseCode(201, "ORDEN DE COMPRA REGISTRADA EXITOSAMENTE"); // RETORNA CÓDIGO Y MENSAJE DE ÉXITO
    }

    // POST: REGISTRAR ENTREGA O DEVOLUCIÓN
    @PostMapping("/entrega-devolucion")
    public ResponseCode registrarEntregaDevolucion(@RequestBody EntregaDevolucion entregaDevolucion) {
        entregaDevolucionService.registrarEntregaDevolucion(entregaDevolucion); // REGISTRA ENTREGA O DEVOLUCIÓN
        return new ResponseCode(201, "ENTREGA O DEVOLUCIÓN REGISTRADA EXITOSAMENTE"); // RETORNA CÓDIGO Y MENSAJE DE ÉXITO
    }
}
