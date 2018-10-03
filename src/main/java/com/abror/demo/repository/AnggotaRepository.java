package com.abror.demo.repository;

/**
 * @author ANIZAM
 *
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abror.demo.model.Anggota;

@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, String>{

	@Query(value = "select * from anggota where status=true", nativeQuery = true)
	List<Anggota> findAll();
	
	Anggota findByIdanggota(String idanggota);

}
