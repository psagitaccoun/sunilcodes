package adornit64.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adornit64.entities.Lead;
import adornit64.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository lr;

	@Override
	public void saveOneLead(Lead lead) {
		lr.save(lead);
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = lr.findAll();
		return leads;
	}

	@Override
	public Lead leadInfo(Long id) {
		Optional<Lead> findById = lr.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}

}
