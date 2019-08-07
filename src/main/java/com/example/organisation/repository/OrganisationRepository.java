package com.example.organisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.organisation.entity.Organisation;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {

}
