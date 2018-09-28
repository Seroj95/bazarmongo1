package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document(collection = "productb")
public class Product {
    @Id

    private String id;

    @Length(min = 3, message = "*Անունը պետք է ունենա առնվազն 5 նիշ")
    private String name;

    private String description;

    @Min(value = 0, message = "*Քանակը պետք է լինի ոչ բացասական թիվ")
    private Integer quantity;

    @DecimalMin(value = "0.00", message = "*Գինը պետք է լինի ոչ բացասական թիվ")
    private BigDecimal price;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Object getName() {
        return null;
    }

    public Object getQuantity() {
        return null;
    }

    public boolean containsKey(Product product) {
        return false;
    }

    public void get(Product product) {
    }

    public void put(Product product, int i) {
    }

    public String getId() {
        return null;
    }
}


