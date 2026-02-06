package com.grc.risktool.model;

import jakarta.persistence.*;

@Entity
@Table(name = "risk")
public class Risk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String asset;
    
    @Column(nullable = false)
    private String threat;
    private int likelihood;
    private int impact;
    private int score;
    private String level;

    public Long getId() { return id; }

    public String getAsset() { return asset; }
    public void setAsset(String asset) { this.asset = asset; }

    public String getThreat() { return threat; }
    public void setThreat(String threat) { this.threat = threat; }

    public int getLikelihood() { return likelihood; }
    public void setLikelihood(int likelihood) { this.likelihood = likelihood; }

    public int getImpact() { return impact; }
    public void setImpact(int impact) { this.impact = impact; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}
