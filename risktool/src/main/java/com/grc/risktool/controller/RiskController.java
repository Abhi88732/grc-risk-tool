package com.grc.risktool.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.grc.risktool.model.Risk;
import com.grc.risktool.repository.RiskRepository;
import com.grc.risktool.service.RiskService;

@RestController
@RequestMapping("/api")
public class RiskController {

    private final RiskRepository repo;
    private final RiskService service;

    public RiskController(RiskRepository repo, RiskService service) {
        this.repo = repo;
        this.service = service;
    }

    @PostMapping("/assess-risk")
    public Risk addRisk(@RequestBody Risk risk) {

        if (risk.getLikelihood() < 1 || risk.getLikelihood() > 5 ||
            risk.getImpact() < 1 || risk.getImpact() > 5) {
            throw new RuntimeException("Likelihood and Impact must be between 1 and 5");
        }

        service.calculateRisk(risk);
        return repo.save(risk);
    }

    @GetMapping("/risks")
    public List<Risk> getRisks(@RequestParam(required = false) String level) {
        if (level != null)
            return repo.findByLevel(level);
        return repo.findAll();
    }
}
