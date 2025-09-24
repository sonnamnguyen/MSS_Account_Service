package msn301.fa25.s4.s1accountservice.service;

import msn301.fa25.s4.s1accountservice.model.Role;
import msn301.fa25.s4.s1accountservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public boolean addRole(Role role) {
        roleRepository.save(role);
        return true;
    }
    @Override
    public Role findByRoleName(String name) {
        return roleRepository.findByName(name);
    }
}
