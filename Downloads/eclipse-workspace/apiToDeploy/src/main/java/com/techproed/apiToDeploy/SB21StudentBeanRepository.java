package com.techproed.apiToDeploy;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SB21StudentBeanRepository extends JpaRepository<SB20StudentBean, Long>{
	
	//SELECT * FROM students WHERE email = ?
	Optional<SB20StudentBean> findSB20StudentBeanByEmail(String email);
	
	//SELECT * FROM students WHERE id = ?
	Optional<SB20StudentBean> findSB20StudentBeanById(Long id);
}
