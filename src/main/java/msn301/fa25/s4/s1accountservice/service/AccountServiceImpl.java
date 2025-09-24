package msn301.fa25.s4.s1accountservice.service;

import msn301.fa25.s4.s1accountservice.model.Account;
import msn301.fa25.s4.s1accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountById(int id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(int id, Account account) {
        if (accountRepository.existsById(id)) {
            account.setAccountId(id);
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public void deleteAccount(int id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @Override
    public Account findByAccountName(String accountName) {
        return accountRepository.findByAccountName(accountName);
    }

    @Override
    public List<Account> findByRoleId(int roleId) {
        return accountRepository.findByRoleId(roleId);
    }

    @Override
    public List<Account> findByRoleName(String roleName) {
        return accountRepository.findByRoleName(roleName);
    }

    @Override
    public List<Account> searchAccountsByEmail(String emailPattern) {
        return accountRepository.findByEmailContaining(emailPattern);
    }

    @Override
    public boolean checkEmailExists(String email) {
        return accountRepository.existsByEmail(email);
    }
}
