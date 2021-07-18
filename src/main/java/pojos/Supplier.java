package pojos;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "Supplier")

public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String brandName;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<Product> product;

    public Supplier(String name, String address, String brandName) {
        this.name = name;
        this.address = address;
        this.brandName = brandName;
    }
}
