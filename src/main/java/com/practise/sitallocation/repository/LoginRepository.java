package com.practise.sitallocation.repository;

import com.practise.sitallocation.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
}
