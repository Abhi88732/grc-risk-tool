package com.grc.risktool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grc.risktool.model.Risk;
import java.util.List;

public interface RiskRepository extends JpaRepository<Risk, Long> {
    List<Risk> findByLevel(String level);
}
