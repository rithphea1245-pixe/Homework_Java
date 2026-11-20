package kh.edu.istad.restfulapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "m1_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column( unique = true ,  nullable = false , length = 30)
    private String code;
    @Column (unique = true , nullable = false ,length = 255)
    private String name;
    private Integer qty;
    @Column (unique = true , nullable = false , length = 255)
    private BigDecimal price;
    @Column (nullable = false)
    private boolean isAvailable;
    //
    @ManyToOne
    private Category category;



}

