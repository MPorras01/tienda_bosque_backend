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
        if (productRepository.count() == 0) {
            List<Product> products = Arrays.asList(
                createProduct(
                    "Traje en Antelino",
                    1100.0,
                    "Elegante traje confeccionado en antelino de alta calidad",
                    "👗",
                    "Ropa",
                    15,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1595777457583-95e059d581b8?w=500",
                        "https://images.unsplash.com/photo-1596783074918-c84cb06531ca?w=500",
                        "https://images.unsplash.com/photo-1564859228273-274232fdb516?w=500"
                    )
                ),
                createProduct(
                    "Traje y Ojorrosa",
                    1180.0,
                    "Conjunto exclusivo con detalles de ojorrosa",
                    "✨",
                    "Ropa",
                    12,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1490481651871-ab68de25d43d?w=500",
                        "https://images.unsplash.com/photo-1467043237213-65f2da53396f?w=500",
                        "https://images.unsplash.com/photo-1529720317453-c8da503f2051?w=500"
                    )
                ),
                createProduct(
                    "Floreta al Límerlanda",
                    1300.0,
                    "Diseño floral inspirado en el Límerlanda",
                    "🌸",
                    "Accesorios",
                    20,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1611652022419-a9419f74343a?w=500",
                        "https://images.unsplash.com/photo-1535632066927-ab7c9ab60908?w=500",
                        "https://images.unsplash.com/photo-1506630448388-4e683c67ddb0?w=500"
                    )
                ),
                createProduct(
                    "Asbero en Algodonante",
                    1180.0,
                    "Pieza artesanal de algodón sostenible",
                    "🎀",
                    "Accesorios",
                    18,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1590736969955-71cc94901144?w=500",
                        "https://images.unsplash.com/photo-1596783074918-c84cb06531ca?w=500"
                    )
                ),
                createProduct(
                    "Vasija de Cerámica Artesanal",
                    850.0,
                    "Vasija hecha a mano por artesanos locales",
                    "🏺",
                    "Cerámica",
                    10,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?w=500",
                        "https://images.unsplash.com/photo-1610701596007-11502861dcfa?w=500",
                        "https://images.unsplash.com/photo-1621607551861-c4d077df4b0c?w=500"
                    )
                ),
                createProduct(
                    "Collar de Plata con Piedras",
                    2200.0,
                    "Joyería fina con piedras naturales",
                    "💎",
                    "Joyería",
                    8,
                    Arrays.asList(
                        "https://images.unsplash.com/photo-1515562141207-7a88fb7ce338?w=500",
                        "https://images.unsplash.com/photo-1599643478518-a784e5dc4c8f?w=500",
                        "https://images.unsplash.com/photo-1611591437281-460bfbe1220a?w=500"
                    )
                )
            );
            
            productRepository.saveAll(products);
            System.out.println("✅ Datos iniciales cargados: " + products.size() + " productos con imágenes");
        }
    }
    
    private Product createProduct(String name, Double price, String description, 
                                  String icon, String category, Integer stock, 
                                  List<String> images) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setIcon(icon);
        product.setCategory(category);
        product.setStock(stock);
        product.setActive(true);
        product.setImages(images);
        // Primera imagen como imageUrl para compatibilidad
        if (!images.isEmpty()) {
            product.setImageUrl(images.get(0));
        }
        return product;
    }
}
