package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "roled")
public class Role {
    private String id;

    private String role;

    private Object CascadeType;
    private Collection<User> users;





}



