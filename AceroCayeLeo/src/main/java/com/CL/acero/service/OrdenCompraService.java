
package com.CL.acero.service; // PAQUETE QUE CONTIENE LOS SERVICIOS

import com.CL.acero.model.OrdenCompra; // IMPORTA LA CLASE OrdenCompra
import com.CL.acero.repository.OrdenCompraRepository; // IMPORTA EL REPOSITORIO OrdenCompraRepository
import org.springframework.beans.factory.annotation.Autowired; // IMPORTA LA ANOTACIÓN Autowired
import org.springframework.stereotype.Service; // IMPORTA LA ANOTACIÓN Service

import java.util.List; // IMPORTA LA CLASE LISTA
import java.util.Optional; // IMPORTA LA CLASE Optional

/**
 * CLASE DE SERVICIO PARA MANEJAR LA LÓGICA DE NEGOCIO RELACIONADA CON
 * ÓRDENES DE COMPRA.
 *
 * @author Leo
 * @author Caye
 */
@Service // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UN SERVICIO DE SPRING
public class OrdenCompraService {

    private final OrdenCompraRepository ordenCompraRepository; // REPOSITORIO PARA ÓRDENES DE COMPRA

    @Autowired // ANOTACIÓN QUE PERMITE QUE SPRING INYECTE LA DEPENDENCIA DEL REPOSITORIO
    public OrdenCompraService(OrdenCompraRepository ordenCompraRepository) {
        this.ordenCompraRepository = ordenCompraRepository; // INICIALIZA EL REPOSITORIO
    }

    // OBTENER TODAS LAS ÓRDENES DE COMPRA
    public List<OrdenCompra> obtenerTodasLasOrdenes() {
        return ordenCompraRepository.findAll(); // DEVUELVE TODAS LAS ÓRDENES DEL REPOSITORIO
    }

    // OBTENER UNA ORDEN DE COMPRA POR SU ID
    public Optional<OrdenCompra> obtenerOrdenPorId(Long id) {
        return ordenCompraRepository.findById(id); // BUSCA Y DEVUELVE LA ORDEN DE COMPRA
    }

    // CREAR UNA NUEVA ORDEN DE COMPRA
    public OrdenCompra crearOrdenCompra(OrdenCompra ordenCompra) {
        return ordenCompraRepository.save(ordenCompra); // GUARDA LA NUEVA ORDEN EN EL REPOSITORIO
    }

    // ACTUALIZAR UNA ORDEN DE COMPRA EXISTENTE
    public OrdenCompra actualizarOrdenCompra(Long id, OrdenCompra ordenCompraActualizada) {
        ordenCompraActualizada.setId(id); // ESTABLECE EL ID EN EL OBJETO ACTUALIZADO
        return ordenCompraRepository.save(ordenCompraActualizada); // GUARDA LA ORDEN ACTUALIZADA EN EL REPOSITORIO
    }

    // ELIMINAR UNA ORDEN DE COMPRA POR SU ID
    public void eliminarOrdenCompra(Long id) {
        ordenCompraRepository.deleteById(id); // ELIMINA LA ORDEN DEL REPOSITORIO POR ID
    }
}
