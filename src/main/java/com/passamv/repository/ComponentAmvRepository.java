package com.passamv.repository;

import com.passamv.entity.ComponentAmv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentAmvRepository extends JpaRepository<ComponentAmv, Integer> {

}
