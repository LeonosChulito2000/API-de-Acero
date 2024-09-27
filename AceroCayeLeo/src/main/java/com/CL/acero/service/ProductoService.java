
package com.CL.acero.service; // PAQUETE QUE CONTIENE LOS SERVICIOS

import com.CL.acero.model.Producto; // IMPORTA LA CLASE Producto
import com.CL.acero.repository.ProductoRepository; // IMPORTA EL REPOSITORIO ProductoRepository
import org.springframework.beans.factory.annotation.Autowired; // IMPORTA LA ANOTACIÓN Autowired
import org.springframework.stereotype.Service; // IMPORTA LA ANOTACIÓN Service

import java.util.List; // IMPORTA LA CLASE LISTA
import java.util.Optional; // IMPORTA LA CLASE Optional

/**
 * CLASE DE SERVICIO PARA MANEJAR LA LÓGICA DE NEGOCIO RELACIONADA CON PRODUCTOS.
 *
 * @author Leo
 * @author Caye
 */
@Service // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UN SERVICIO DE SPRING
public class ProductoService {

    private final ProductoRepository productoRepository; // REPOSITORIO PARA PRODUCTOS

    @Autowired // ANOTACIÓN QUE PERMITE QUE SPRING INYECTE LA DEPENDENCIA DEL REPOSITORIO
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository; // INICIALIZA EL REPOSITORIO
    }

    // OBTENER TODOS LOS PRODUCTOS
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll(); // DEVUELVE TODOS LOS PRODUCTOS DEL REPOSITORIO
    }

    // OBTENER UN PRODUCTO POR SU ID
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id); // BUSCA Y DEVUELVE EL PRODUCTO
    }

    // CREAR UN NUEVO PRODUCTO
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto); // GUARDA EL NUEVO PRODUCTO EN EL REPOSITORIO
    }

    // ACTUALIZAR UN PRODUCTO EXISTENTE
    public Producto actualizarProducto(Long id, Producto productoActualizado) {
        productoActualizado.setIdProducto(id); // ESTABLECE EL ID EN EL OBJETO ACTUALIZADO
        return productoRepository.save(productoActualizado); // GUARDA EL PRODUCTO ACTUALIZADO EN EL REPOSITORIO
    }

    // ELIMINAR UN PRODUCTO POR SU ID
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id); // ELIMINA EL PRODUCTO DEL REPOSITORIO POR ID
    }

    // BUSCAR PRODUCTOS POR NOMBRE
    public List<Producto> buscarProductosPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre); // DEVUELVE UNA LISTA DE PRODUCTOS QUE COINCIDEN CON EL NOMBRE
    }
}
