package open.secret.com.pocjavamock.domain.service;

import org.springframework.stereotype.Service;

import open.secret.com.pocjavamock.domain.Address;

@Service
public class AddressService { 
    public Address getAddress() {
        return new Address(
        1L, 
        "Porto Alegre", 
        "RS", 
        "Siqueira Campos", 
        "90010-000", 
        340);
    }
}
