package com.AddressBookWorskshop.repository;

import com.AddressBookWorskshop.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
}