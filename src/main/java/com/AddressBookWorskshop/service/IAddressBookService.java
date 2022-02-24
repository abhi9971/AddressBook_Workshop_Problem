package com.AddressBookWorskshop.service;

import com.AddressBookWorskshop.dto.AddressBookDTO;
import com.AddressBookWorskshop.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    public AddressBook saveAddress(AddressBookDTO addressBookDTO);

    public List<AddressBook> getListOfAddresses();

    public AddressBook getAddressById(Integer id);

    public AddressBook updateDateById(Integer id, AddressBookDTO addressBookDTO);

    public void deleteContact(Integer id);
}
