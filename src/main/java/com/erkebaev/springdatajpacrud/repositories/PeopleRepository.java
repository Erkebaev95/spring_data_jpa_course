package com.erkebaev.springdatajpacrud.repositories;

import com.erkebaev.springdatajpacrud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}