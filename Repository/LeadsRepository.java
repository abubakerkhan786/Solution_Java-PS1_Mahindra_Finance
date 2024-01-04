package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.LeadsRepository;

public interface LeadsRepository extends JpaRepository<LeadsData, Long>{

	public LeadsData findByMobileNumber(Long mobileNumber);

}