package com.model.repository.employee;

import com.model.entity.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDivisionRepository extends JpaRepository<Division,Long> {
}
