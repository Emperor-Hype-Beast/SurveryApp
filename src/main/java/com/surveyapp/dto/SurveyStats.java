package com.surveyapp.dto;

public class SurveyStats {
    private Long totalSurveys;
    private Double averageAge;
    private Integer oldestPerson;
    private Integer youngestPerson;
    private Double pizzaPercentage;
    private Double averageEatOutRating;
    
    // Constructors
    public SurveyStats() {}
    
    public SurveyStats(Long totalSurveys, Double averageAge, Integer oldestPerson, 
                      Integer youngestPerson, Double pizzaPercentage, Double averageEatOutRating) {
        this.totalSurveys = totalSurveys;
        this.averageAge = averageAge;
        this.oldestPerson = oldestPerson;
        this.youngestPerson = youngestPerson;
        this.pizzaPercentage = pizzaPercentage;
        this.averageEatOutRating = averageEatOutRating;
    }
    
    // Getters and Setters
    public Long getTotalSurveys() { return totalSurveys; }
    public void setTotalSurveys(Long totalSurveys) { this.totalSurveys = totalSurveys; }
    
    public Double getAverageAge() { return averageAge; }
    public void setAverageAge(Double averageAge) { this.averageAge = averageAge; }
    
    public Integer getOldestPerson() { return oldestPerson; }
    public void setOldestPerson(Integer oldestPerson) { this.oldestPerson = oldestPerson; }
    
    public Integer getYoungestPerson() { return youngestPerson; }
    public void setYoungestPerson(Integer youngestPerson) { this.youngestPerson = youngestPerson; }
    
    public Double getPizzaPercentage() { return pizzaPercentage; }
    public void setPizzaPercentage(Double pizzaPercentage) { this.pizzaPercentage = pizzaPercentage; }
    
    public Double getAverageEatOutRating() { return averageEatOutRating; }
    public void setAverageEatOutRating(Double averageEatOutRating) { this.averageEatOutRating = averageEatOutRating; }
}