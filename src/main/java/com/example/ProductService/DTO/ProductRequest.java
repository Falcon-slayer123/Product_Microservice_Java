package com.example.ProductService.DTO;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductRequest {

    private String name;
    private String description;
    private float price;


}
