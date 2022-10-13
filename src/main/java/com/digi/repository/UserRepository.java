package com.digi.repository;

import com.digi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(nativeQuery = true, value = "select * from users where id = ?")
    User getById(int id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "update users set email = ? where id = ?")
    void updateEmail(String email, int id);

}
