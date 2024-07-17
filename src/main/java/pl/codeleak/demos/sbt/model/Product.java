package pl.codeleak.demos.sbt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    @Column(name = "pname")
    private String pname;

    @Column(name = "description")
    private String description;

    @Column(name = "unit")
    private String unit;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "image")
    private String image;

    @Column(name = "category_id")
    private int category_id;

    public Product() {
    }

    public Product(String pname, String description, String unit, int quantity, String image, int category_id) {
        this.pname = pname;
        this.description = description;
        this.unit = unit;
        this.quantity = quantity;
        this.image = image;
        this.category_id = category_id;
    }
}
