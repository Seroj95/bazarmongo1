package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Document(collection = "userb")

public class User {
    @Id

    private String id;

    @Email(message = "*Խնդրում ենք տրամադրել վավեր Email")
    @NotEmpty(message = "*Խնդրում ենք տրամադրել email")
    private String email;

    @Length(min = 5, message = "*Ձեր գաղտնաբառը պետք է ունենա առնվազն 5 նիշ")
    @NotEmpty(message = "*Խնդրում ենք մուտքագրել ձեր գաղտնաբառը")
    @JsonIgnore
    private String password;

    @Length(min = 5, message = "*Ձեր անունը պետք է ունենա առնվազն 5 նիշ")
    @NotEmpty(message = "*Խնդրում ենք մուտքագրել ձեր անունը")
    private String username;

    @NotEmpty(message = "*Խնդրում ենք մուտքագրել ձեր անունը")
    private String name;

    @NotEmpty(message = "*Խնդրում ենք մուտքագրել ձեր ազգանունը")
    private String lastName;

    private int active;

    private Collection<Role> roles;
}
