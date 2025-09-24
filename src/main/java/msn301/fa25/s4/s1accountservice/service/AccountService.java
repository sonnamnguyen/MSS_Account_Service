package msn301.fa25.s4.s1accountservice.service;

import msn301.fa25.s4.s1accountservice.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {
    List<Account> getAllAccounts();

    Optional<Account> getAccountById(int id);

    Account createAccount(Account account);

    Account updateAccount(int id, Account account);

    void deleteAccount(int id);

    Account findByEmail(String email);

    Account findByAccountName(String accountName);

    List<Account> findByRoleId(int roleId);

    List<Account> findByRoleName(String roleName);

    List<Account> searchAccountsByEmail(String emailPattern);

    boolean checkEmailExists(String email);
}
