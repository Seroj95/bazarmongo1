package repository;

import model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends MongoRepository <Role,String> {
    Role findByRole(@Param("role") String role);
}
