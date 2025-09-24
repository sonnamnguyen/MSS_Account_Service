package msn301.fa25.s4.s1accountservice.repository;

import msn301.fa25.s4.s1accountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    // Find by email
    Account findByEmail(String email);

    // Find by account name
    Account findByAccountName(String accountName);

    // Find by role ID
    List<Account> findByRoleId(int roleId);


    // Search by email containing pattern
    List<Account> findByEmailContaining(String emailPattern);

    // Check if email exists
    boolean existsByEmail(String email);

    // Find by role name and email containing
    List<Account> findByRoleNameAndEmailContaining(String roleName, String email);

    // Find by account name containing
    List<Account> findByAccountNameContaining(String accountName);

    // Search emails (alias for findByEmailContaining)
    default List<Account> search(String emailPattern) {
        return findByEmailContaining(emailPattern);
    }

    List<Account> findByRoleName(String roleName);

}
