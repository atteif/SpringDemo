package tn.esprit.springbootdatajpaentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootdatajpaentity.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
