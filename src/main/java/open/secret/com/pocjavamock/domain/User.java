package open.secret.com.pocjavamock.domain;

import java.util.Objects;

public record User(
    Long id,
    String name, 
    String document, 
    String phone, 
    String email, 
    Address address) {

    @Override
    public int hashCode() {
        return Objects.hash(id, name, document, phone, email, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id) 
               && Objects.equals(name, user.name) 
               && Objects.equals(document, user.document)
               && Objects.equals(phone, user.phone) 
               && Objects.equals(email, user.email)
               && Objects.equals(address, user.address);
    }
}
