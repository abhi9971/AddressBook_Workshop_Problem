package com.AddressBookWorskshop.service;

import com.AddressBookWorskshop.dto.AddressBookDTO;
import com.AddressBookWorskshop.model.AddressBook;
import com.AddressBookWorskshop.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AddressBookService {
    //Autowired repository class to inject its dependency
    @Autowired
    AddressBookRepository repository;

    //Created service method which serves controller api to retrieve all records
    public List<AddressBook> getListOfAddresses() {
        List<AddressBook> addressBooks = repository.findAll();
        return addressBooks;
    }

    //Created service method which serves controller api to post data
    public AddressBook saveAddress(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(addressBookDTO);
        repository.save(addressBook);
        return addressBook;
    }

    //Created service method which serves controller api to get record by id
    public AddressBook getAddressbyId(Integer id) {
        Optional<AddressBook> addressBook = repository.findById(id);
        return addressBook.get();
    }

    //Created service method which serves controller api to update record by id
    public AddressBook updateDateById(Integer id, AddressBookDTO addressBookDTO) {
        AddressBook addressBook = new AddressBook(id, addressBookDTO);
        repository.save(addressBook);
        return addressBook;
    }

    //Created service method which serves controller api to delete record by id
    public void deleteContact(Integer id) {
        repository.deleteById(id);
    }
}
