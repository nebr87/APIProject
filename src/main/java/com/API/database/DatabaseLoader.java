package com.API.database;

import com.API.entities.Address;
import com.API.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by myworklaptopmyworklaptop on 12/28/16.
 */
@Component
@EnableJpaRepositories(basePackages="com.API.repositories", entityManagerFactoryRef="emf")
public class DatabaseLoader implements ApplicationRunner {
    private final AddressRepository addressRepository;

    @Autowired
    public DatabaseLoader(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Address address=new Address("100 Arlington St.","Rockville","MD",20850);
        addressRepository.save(address);
    }

}
