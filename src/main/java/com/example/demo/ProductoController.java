package com.example.demo;

import com.example.demo.especificacion.ProductoSpecifications;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepository productoRepository;

    @GetMapping("/search")
    public ResponseEntity<List<Producto>> buscarProductos (
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) List<String> marcas) {
        List<Producto> productos = productoRepository.findAll(ProductoSpecifications.filtrarPor(nombre, marcas));
        return ResponseEntity.ok(productos);
    }


}