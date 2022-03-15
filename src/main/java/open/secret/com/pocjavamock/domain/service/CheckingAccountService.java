package open.secret.com.pocjavamock.domain.service;

import org.springframework.stereotype.Service;

import open.secret.com.pocjavamock.domain.CheckingAccount;
import open.secret.com.pocjavamock.domain.User;

@Service
public class CheckingAccountService {
    
    final UserService userService;

    public CheckingAccountService(UserService userService) {
        this.userService = userService;
    }

    public CheckingAccount getCheckingAccount(final Integer number) {
        var user = userService.getUser();
        
        validation(user);

        return new CheckingAccount(1L, number, 10.000, 500.000, user);
    }

    private void validation(User user) {
        if (user.address() != null) {
            System.out.println("TESTE");
        }
    }
}
