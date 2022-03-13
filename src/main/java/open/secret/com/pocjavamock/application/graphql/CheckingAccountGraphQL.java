package open.secret.com.pocjavamock.application.graphql;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import open.secret.com.pocjavamock.domain.CheckingAccount;
import open.secret.com.pocjavamock.domain.service.CheckingAccountService;

@Component
public class CheckingAccountGraphQL implements GraphQLQueryResolver {
    
    private final CheckingAccountService accountService;

    public CheckingAccountGraphQL(CheckingAccountService accountService) {
        this.accountService = accountService;
    }

    public CheckingAccount findCheckingAccount(final Integer number) {
        return accountService.getCheckingAccount(number);
    }
}
