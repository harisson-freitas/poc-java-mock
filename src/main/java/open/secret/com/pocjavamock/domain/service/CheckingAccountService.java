package open.secret.com.pocjavamock.domain.service;

import org.springframework.stereotype.Service;

import open.secret.com.pocjavamock.domain.CheckingAccount;

@Service
public class CheckingAccountService {
    
    final UserService userService;

    public CheckingAccountService(UserService userService) {
        this.userService = userService;
    }

    public CheckingAccount getCheckingAccount(final Integer number) {
        var user = userService.getUser();
        
        return new CheckingAccount(1L, number, 10.000, 500.000, user);
    }
}
