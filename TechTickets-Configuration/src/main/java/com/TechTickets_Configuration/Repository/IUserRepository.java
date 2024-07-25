package com.TechTickets_Configuration.Repository;

import com.TechTickets_Configuration.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String mail);

    Boolean existsByIdNumber(Long idNumber);
}
