package ec.edu.espe.arquitectura.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.facturacio.model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    
}
