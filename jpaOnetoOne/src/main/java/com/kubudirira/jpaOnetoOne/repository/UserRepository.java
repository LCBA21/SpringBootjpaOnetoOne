package com.kubudirira.jpaOnetoOne.repository;

import com.kubudirira.jpaOnetoOne.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
