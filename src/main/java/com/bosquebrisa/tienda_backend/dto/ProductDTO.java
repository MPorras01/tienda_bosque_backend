package com.bosquebrisa.tienda_backend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private String price;
    private String description;
    private String icon;
    private String category;
    private Integer stock;
    private String imageUrl;
}
