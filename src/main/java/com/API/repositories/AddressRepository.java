package com.API.repositories;

import com.API.entities.Address;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by myworklaptopmyworklaptop on 12/28/16.
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    public void create(Address address);
    public void delete(Address address);
    public void update(Address address);
    public Address read(long id);

}
