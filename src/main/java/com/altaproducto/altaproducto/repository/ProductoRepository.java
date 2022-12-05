package com.altaproducto.altaproducto.repository;

import com.altaproducto.altaproducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, String> {
    Optional<Producto> findById(String id);

    void delete(String id);
}
