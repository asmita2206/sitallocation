package com.practise.sitallocation.repository;

import com.practise.sitallocation.entity.Sits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SitRepository extends JpaRepository<Sits, Integer> {
}
