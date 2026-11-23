package com.example.demo;

import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeed implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productoRepository.count() == 0) {
            List<Producto> productos = List.of(
                    new Producto("Portátil MacBook Pro 14", new BigDecimal("2199.99"), "Apple"),
                    new Producto("Portátil HP Pavilion 15", new BigDecimal("749.50"), "HP"),
                    new Producto("Portátil Lenovo ThinkPad X1", new BigDecimal("1599.00"), "Lenovo"),
                    new Producto("Ratón Logitech MX Master 3S", new BigDecimal("99.90"), "Logitech"),
                    new Producto("Ratón Apple Magic Mouse", new BigDecimal("85.00"), "Apple"),
                    new Producto("Teclado Mecánico Logitech G Pro", new BigDecimal("129.00"), "Logitech"),
                    new Producto("Monitor HP 27 Pulgadas 4K", new BigDecimal("349.99"), "HP"),
                    new Producto("Tablet iPad Air", new BigDecimal("699.00"), "Apple"),
                    new Producto("Tablet Lenovo Tab P11", new BigDecimal("279.00"), "Lenovo")
            );

            productoRepository.saveAll(productos);
        }
    }
}