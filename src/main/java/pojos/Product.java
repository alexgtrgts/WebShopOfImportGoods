package pojos;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Supplier_id")
    private Supplier supplier;

    public Product(String name, String type, String description, double price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public Product(String name, String type, String description, String price) {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) && Objects.equals(type, product.type) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, price);
    }
}
