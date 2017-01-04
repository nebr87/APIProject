package service;

import com.API.entities.Address;
import com.API.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by myworklaptopmyworklaptop on 1/3/17.
 */
@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    public void create(Address address)
    {
        addressRepository.create(address);
    }
    public void delete(Address address){
        addressRepository.delete(address);
    }
    public void update(Address address){
        addressRepository.update(address);
    }
    public Address read(long id){
        return addressRepository.read(id);
    }
}
