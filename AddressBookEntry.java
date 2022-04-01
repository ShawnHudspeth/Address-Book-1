package com.AddressBook.TTS;

import java.util.ArrayList;
import java.util.List;


public class AddressBookEntry {

    private List<AddressBookEntry> listOfEntries;

    public AddressBookEntry() {
        this.listOfEntries = new ArrayList<>();
    }

    public void add(AddressBookEntry addressBookEntry) {

        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(int index) {
        this.listOfEntries.remove(index);
    }

    public AddressBookEntry get(int index) {
        return this.listOfEntries.get(index);
    }

    public AddressBookEntry[] viewAll() {

        AddressBookEntry[] result = new AddressBookEntry[this.listOfEntries.size()];
        this.listOfEntries.toArray(result);

        return result;
    }
}