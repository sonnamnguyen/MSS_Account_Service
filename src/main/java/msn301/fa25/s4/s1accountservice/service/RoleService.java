package msn301.fa25.s4.s1accountservice.service;


import msn301.fa25.s4.s1accountservice.model.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    public boolean addRole(Role role);
    public Role findByRoleName(String name);
}
