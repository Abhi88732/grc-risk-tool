package com.grc.risktool.service;

import org.springframework.stereotype.Service;
import com.grc.risktool.model.Risk;

@Service
public class RiskService {

    public void calculateRisk(Risk risk) {
        int score = risk.getLikelihood() * risk.getImpact();
        risk.setScore(score);

        if (score <= 5)
            risk.setLevel("Low");
        else if (score <= 12)
            risk.setLevel("Medium");
        else if (score <= 18)
            risk.setLevel("High");
        else
            risk.setLevel("Critical");
    }
}
