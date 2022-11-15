package adornit64.service;

import java.util.List;

import adornit64.entities.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);

	List<Lead> listAll();

Lead leadInfo(Long id);

}
