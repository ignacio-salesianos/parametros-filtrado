package com.example.demo.especificacion;

import com.example.demo.modelo.Producto;
import org.springframework.data.jpa.domain.PredicateSpecification;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

public class ProductoSpecifications {

    public static PredicateSpecification<Producto> filtrarPor(String nombre, List<String> marcas) {
        return (root, builder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (nombre != null && !nombre.isBlank()) {
                predicates.add(builder.like(builder.lower(root.get("nombre")), "%" + nombre.toLowerCase() + "%"));
            }

            if (marcas != null && !marcas.isEmpty()) {
                predicates.add(root.get("marca").in(marcas));
            }


            return builder.and(predicates.toArray(new Predicate[0]));

        };
    }
}
