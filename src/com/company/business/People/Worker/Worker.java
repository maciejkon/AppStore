package com.company.business.People.Worker;


import com.company.business.People.Human;

public class Worker extends Human {

    private Double employmentCost;
    private Double maintenanceCost;
    private Double costOfDismissal;
    private Double workplaceCost;
    private Double chanceToGetSick;
    private Double riskOfCorrection;
    private Double riskOfDelay;

    public Worker(String name, String surname, Double money, String email) {
        super(name, surname, money, email);
    }


    public void setEmploymentCost(Double employmentCost) {
        this.employmentCost = employmentCost;
    }

    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public void setCostOfDismissal(Double costOfDismissal) {
        this.costOfDismissal = costOfDismissal;
    }

    public void setWorkplaceCost(Double workplaceCost) {
        this.workplaceCost = workplaceCost;
    }

    public void setChanceToGetSick(Double chanceToGetSick) {
        this.chanceToGetSick = chanceToGetSick;
    }

    public void setRiskOfCorrection(Double riskOfCorrection) {
        this.riskOfCorrection = riskOfCorrection;
    }

    public void setRiskOfDelay(Double riskOfDelay) {
        this.riskOfDelay = riskOfDelay;
    }

    public Double getEmploymentCost() {
        return employmentCost;
    }

    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public Double getCostOfDismissal() {
        return costOfDismissal;
    }

    public Double getWorkplaceCost() {
        return workplaceCost;
    }

    public Double getChanceToGetSick() {
        return chanceToGetSick;
    }

    public Double getRiskOfCorrection() {
        return riskOfCorrection;
    }

    public Double getRiskOfDelay() {
        return riskOfDelay;
    }
}