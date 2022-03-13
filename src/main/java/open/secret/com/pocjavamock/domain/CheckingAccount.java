package open.secret.com.pocjavamock.domain;

import java.util.Objects;

public record CheckingAccount(
    Long id, 
    Integer number, 
    Double checkingAccountBalance, 
    Double applicationAccountBalance,
    User user) {

    @Override
    public int hashCode() {
        return Objects.hash(id, number, checkingAccountBalance, applicationAccountBalance, user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CheckingAccount checkingAccount = (CheckingAccount) o;
        return Objects.equals(id, checkingAccount.id) && Objects.equals(number, checkingAccount.number)
                && Objects.equals(checkingAccountBalance, checkingAccount.checkingAccountBalance)
                && Objects.equals(applicationAccountBalance, checkingAccount.applicationAccountBalance)
                && Objects.equals(user, checkingAccount.user);
    }
}
