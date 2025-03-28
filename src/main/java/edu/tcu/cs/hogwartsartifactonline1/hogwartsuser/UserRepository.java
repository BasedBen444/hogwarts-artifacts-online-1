package edu.tcu.cs.hogwartsartifactonline1.hogwartsuser;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<HogwartsUser, Integer> {
}