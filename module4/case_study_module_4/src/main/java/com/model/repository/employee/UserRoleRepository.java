package com.model.repository.employee;

import com.model.entity.employee.AppUser;
import com.model.entity.employee.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
