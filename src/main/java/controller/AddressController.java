package controller;

import com.API.entities.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AddressService;


/**
 * Created by myworklaptopmyworklaptop on 1/3/17.
 */
@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value="/create", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void create(@RequestBody Address address){
        addressService.create(address);

    }
    @RequestMapping(value="/delete", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void delete(@RequestBody Address address){
        addressService.delete(address);

    }

    public void update(@RequestBody Address address){
        addressService.update(address);

    }
    public Address read(@PathVariable long id){
        return addressService.read(id);
    }



}
