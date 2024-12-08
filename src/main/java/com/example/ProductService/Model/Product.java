package com.example.ProductService.Model;





import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private float price;


}
