package adornit64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import adornit64.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
