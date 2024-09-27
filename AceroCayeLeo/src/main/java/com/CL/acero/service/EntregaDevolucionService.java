package com.CL.acero.service; // PAQUETE QUE CONTIENE LOS SERVICIOS

import com.CL.acero.model.EntregaDevolucion; // IMPORTA LA CLASE EntregaDevolucion
import com.CL.acero.repository.EntregaDevolucionRepository; // IMPORTA EL REPOSITORIO EntregaDevolucionRepository
import org.springframework.beans.factory.annotation.Autowired; // IMPORTA LA ANOTACIÓN Autowired
import org.springframework.stereotype.Service; // IMPORTA LA ANOTACIÓN Service

import java.util.List; // IMPORTA LA CLASE LISTA
import java.util.Optional; // IMPORTA LA CLASE Optional

/**
 * CLASE DE SERVICIO PARA MANEJAR LA LÓGICA DE NEGOCIO RELACIONADA CON
 * ENTREGAS Y DEVOLUCIONES.
 *
 * @author Leo
 * @author Caye
 */
@Service // ANOTACIÓN QUE INDICA QUE ESTA CLASE ES UN SERVICIO DE SPRING
public class EntregaDevolucionService {

    private final EntregaDevolucionRepository entregaDevolucionRepository; // REPOSITORIO PARA ENTREGAS Y DEVOLUCIONES

    @Autowired // ANOTACIÓN QUE PERMITE QUE SPRING INYECTE LA DEPENDENCIA DEL REPOSITORIO
    public EntregaDevolucionService(EntregaDevolucionRepository entregaDevolucionRepository) {
        this.entregaDevolucionRepository = entregaDevolucionRepository; // INICIALIZA EL REPOSITORIO
    }

    // OBTENER TODAS LAS ENTREGAS Y DEVOLUCIONES
    public List<EntregaDevolucion> obtenerTodasLasEntregasDevoluciones() {
        return entregaDevolucionRepository.findAll(); // DEVUELVE TODAS LAS ENTRADAS DEL REPOSITORIO
    }

    // OBTENER UNA ENTREGA O DEVOLUCIÓN POR SU ID
    public Optional<EntregaDevolucion> obtenerEntregaDevolucionPorId(Long id) {
        return entregaDevolucionRepository.findById(id); // BUSCA Y DEVUELVE LA ENTREGA O DEVOLUCIÓN
    }

    // REGISTRAR UNA NUEVA ENTREGA O DEVOLUCIÓN
    public EntregaDevolucion registrarEntregaDevolucion(EntregaDevolucion entregaDevolucion) {
        return entregaDevolucionRepository.save(entregaDevolucion); // GUARDA LA NUEVA ENTRADA EN EL REPOSITORIO
    }

    // ACTUALIZAR UNA ENTREGA O DEVOLUCIÓN EXISTENTE
    public EntregaDevolucion actualizarEntregaDevolucion(Long id, EntregaDevolucion entregaDevolucionActualizada) {
        entregaDevolucionActualizada.setId(id); // ESTABLECE EL ID EN EL OBJETO ACTUALIZADO
        return entregaDevolucionRepository.save(entregaDevolucionActualizada); // GUARDA LA ENTRADA ACTUALIZADA EN EL REPOSITORIO
    }

    // ELIMINAR UNA ENTREGA O DEVOLUCIÓN POR SU ID
    public void eliminarEntregaDevolucion(Long id) {
        entregaDevolucionRepository.deleteById(id); // ELIMINA LA ENTRADA DEL REPOSITORIO POR ID
    }
}
