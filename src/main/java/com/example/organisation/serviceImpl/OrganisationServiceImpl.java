package com.example.organisation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organisation.entity.Organisation;
import com.example.organisation.repository.OrganisationRepository;
import com.example.organisation.service.OrganisationService;

@Service
public class OrganisationServiceImpl implements OrganisationService
{
	@Autowired
	private OrganisationRepository organisationRepository;

	@Override
	public List<Organisation> getAll() {
		List<Organisation> organisations = organisationRepository.findAll();
		return organisations;
	}
	
}
