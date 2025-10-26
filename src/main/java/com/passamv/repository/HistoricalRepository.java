package com.passamv.repository;

import com.passamv.entity.Historical;
import com.passamv.entity.HistoricalPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, HistoricalPK> {
}
