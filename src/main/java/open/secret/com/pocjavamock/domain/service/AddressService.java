package open.secret.com.pocjavamock.domain.service;

import org.springframework.stereotype.Service;

import open.secret.com.pocjavamock.domain.Address;

@Service
public class AddressService { 
    public Address getAddress() {
        validation(null);
        
        return new Address(
        1L, 
        "Porto Alegre", 
        "RS", 
        "Siqueira Campos", 
        "90010-000", 
        340);
    }

    private void validation(Address address) {
	    if (address.id() == 2L) {
	        System.out.println("TESTE"); 
	    }

        if (address.city.equals("Campo Novo")) {
	        System.out.println("TESTE"); 
	    }

        if (address.id() == 2L) {
	        System.out.println("TESTE"); 
	    }

        if (address.street().equals("Cacimbas")) {
	        System.out.println("TESTE"); 
	    }

        if (address.id() == 2L) {
	        System.out.println("TESTE"); 
	    }
    }
}
