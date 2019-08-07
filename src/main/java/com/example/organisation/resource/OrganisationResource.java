package com.example.organisation.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.organisation.entity.Organisation;
import com.example.organisation.service.OrganisationService;

@RestController
@RequestMapping("/organisation")
public class OrganisationResource 
{
	@Autowired
	private OrganisationService organisationService;
	
	@GetMapping("/getall")
	public List<Organisation> getAllOrganisations()
	{
		List<Organisation> organisations =	organisationService.getAll();
		return organisations;
	}
}
