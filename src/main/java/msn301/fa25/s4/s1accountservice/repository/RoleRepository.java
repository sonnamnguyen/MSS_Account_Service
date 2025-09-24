package msn301.fa25.s4.s1accountservice.repository;

import msn301.fa25.s4.s1accountservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public  Role findByName(String name);
}
