package com.example.demo.Repository;

import com.example.demo.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Transactional
    @Modifying
    @Query(value = "select * from user where name=?1 and password=?2",nativeQuery = true)
    public List<User> findUser(String name, String password);
}
