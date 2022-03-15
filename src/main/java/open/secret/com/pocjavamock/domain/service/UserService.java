package open.secret.com.pocjavamock.domain.service;

import org.springframework.stereotype.Service;

import open.secret.com.pocjavamock.domain.User;

@Service
public class UserService {
    private final AddressService addressService;

    public UserService(AddressService addressService) {
        this.addressService = addressService;
    }

    public User getUser() {
        var address = addressService.getAddress();

        validation(null);

        return new User(
            1L, 
            "Teste Demo", 
            "826.718.840-10", 
            "(51) 991209120", 
            "teste@teste.com.br", 
            address);
    }
    
    private void validation(User user) {
	    if (user.id() == 2L) {
	        System.out.println("TESTE"); 
	    }
    }
}
