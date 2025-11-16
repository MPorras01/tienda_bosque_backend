package com.bosquebrisa.tienda_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    
    @Id
    private String id;
    
    @NotBlank(message = "El nombre es obligatorio")
    private String name;
    
    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser positivo")
    private Double price;
    
    private String description;
    
    private String icon; // Emoji o nombre de imagen
    
    private String category;
    
    private Integer stock;
    
    private Boolean active = true;
    
    private List<String> images = new ArrayList<>();
    
    private String imageUrl;
}
