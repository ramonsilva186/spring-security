package br.com.ramonsilva186.springsecurity.repository;

import br.com.ramonsilva186.springsecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName(String name);
}
