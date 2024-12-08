package com.example.ProductService.DTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private float price;
}
