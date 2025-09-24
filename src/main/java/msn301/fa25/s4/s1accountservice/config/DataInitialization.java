package msn301.fa25.s4.s1accountservice.config;

import msn301.fa25.s4.s1accountservice.model.Account;
import msn301.fa25.s4.s1accountservice.model.Role;
import msn301.fa25.s4.s1accountservice.repository.AccountRepository;
import msn301.fa25.s4.s1accountservice.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableJpaRepositories(basePackages = "msn301.fa25.s4.s1accountservice.repository")
public class DataInitialization implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Skip if data exists
        if (roleRepository.count() > 0 || accountRepository.count() > 0) {
            System.out.println("Data already exists, skipping initialization");
            return;
        }

        // Create roles
        Role adminRole = new Role();
        adminRole.setName("ADMIN");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setName("USER");
        roleRepository.save(userRole);

        // Create accounts
        Account admin = new Account();
        admin.setAccountName("admin");
        admin.setEmail("admin@example.com");
        admin.setPassword("admin123"); // Plain text password
        admin.setRole(adminRole);
        accountRepository.save(admin);

        Account user = new Account();
        user.setAccountName("user");
        user.setEmail("user@example.com");
        user.setPassword("user123"); // Plain text password
        user.setRole(userRole);
        accountRepository.save(user);

        System.out.println("Data initialized successfully");
    }
}
