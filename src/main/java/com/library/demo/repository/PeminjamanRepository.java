package com.library.demo.repository;

/**
 * @author ANIZAM
 *
 */
import java.util.List;

/**
 * @author ANIZAM
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Peminjaman;

@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Integer>{

	@Query(value = "select * from peminjaman where status=true", nativeQuery=true)
	List<Peminjaman> findAll();
	
	Peminjaman findByKdpeminjaman(String kdpeminjaman);

}