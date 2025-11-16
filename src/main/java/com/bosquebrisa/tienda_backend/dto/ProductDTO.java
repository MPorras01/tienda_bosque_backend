package com.bosquebrisa.tienda_backend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private String price; // Formateado como "$1,100"
    private String description;
    private String icon;
    private String category;
    private Integer stock;
    private List<String> images = new ArrayList<>();
    private String imageUrl;
}
