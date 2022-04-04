package com.practise.sitallocation.repository;

import com.practise.sitallocation.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends JpaRepository<Floor, String> {
}
