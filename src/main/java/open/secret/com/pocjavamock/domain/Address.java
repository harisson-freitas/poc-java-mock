package open.secret.com.pocjavamock.domain;

import java.util.Objects;

public record Address(
    Long id, 
    String city, 
    String state, 
    String street, 
    String zipCode, 
    Integer number) {
    
        @Override
        public int hashCode() {
            return Objects.hash(id, city, state, street, zipCode, number);
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return Objects.equals(id, address.id) &&
                    Objects.equals(city, address.city) &&
                    Objects.equals(state, address.state) &&
                    Objects.equals(street, address.street) &&
                    Objects.equals(zipCode, address.zipCode) &&
                    Objects.equals(number, address.number);
        }
    }
