package com.bosquebrisa.tienda_backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bosquebrisa.tienda_backend.model.Product;
import com.bosquebrisa.tienda_backend.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public void run(String... args) {
        // Solo cargar datos si la colección está vacía
        if (productRepository.count() == 0) {
            List<Product> products = Arrays.asList(
                new Product(null, "Traje en Antelino", 1100.0, 
                    "Elegante traje confeccionado en antelino de alta calidad", 
                    "👗", "Ropa", 15, true, null),
                    
                new Product(null, "Traje y Ojorrosa", 1180.0, 
                    "Conjunto exclusivo con detalles de ojorrosa", 
                    "✨", "Ropa", 12, true, null),
                    
                new Product(null, "Floreta al Límerlanda", 1300.0, 
                    "Diseño floral inspirado en el Límerlanda", 
                    "🌸", "Accesorios", 20, true, null),
                    
                new Product(null, "Asbero en Algodonante", 1180.0, 
                    "Pieza artesanal de algodón sostenible", 
                    "🎀", "Accesorios", 18, true, null),
                    
                new Product(null, "Vasija de Cerámica Artesanal", 850.0, 
                    "Vasija hecha a mano por artesanos locales", 
                    "🏺", "Cerámica", 10, true, null),
                    
                new Product(null, "Collar de Plata con Piedras", 2200.0, 
                    "Joyería fina con piedras naturales", 
                    "💎", "Joyería", 8, true, null)
            );
            
            productRepository.saveAll(products);
            System.out.println("✅ Datos iniciales cargados: " + products.size() + " productos");
        }
    }
}
