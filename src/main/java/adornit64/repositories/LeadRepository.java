package adornit64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import adornit64.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
