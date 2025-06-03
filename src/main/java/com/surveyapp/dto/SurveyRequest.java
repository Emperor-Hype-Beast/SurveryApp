package com.surveyapp.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class SurveyRequest {
    
    @NotBlank(message = "Surname is required")
    private String surname;
    
    @NotBlank(message = "First name is required")
    private String firstName;
    
    @NotBlank(message = "Contact number is required")
    private String contactNumber;
    
    @NotNull(message = "Age is required")
    @Min(value = 5, message = "Age must be at least 5")
    @Max(value = 120, message = "Age must not exceed 120")
    private Integer age;
    
    @NotNull(message = "Date is required")
    private LocalDate date;
    
    private Boolean likesPizza = false;
    private Boolean likesPasta = false;
    private Boolean likesPapAndWors = false;
    private Boolean likesChicken = false;
    private Boolean likesBeef = false;
    private Boolean likesOther = false;
    
    @NotNull(message = "Eat out rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    private Integer eatOutRating;
    
    @NotNull(message = "Watch movies rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    private Integer watchMoviesRating;
    
    @NotNull(message = "Watch TV rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    private Integer watchTvRating;
    
    @NotNull(message = "Listen to radio rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    private Integer listenToRadioRating;
    
    // Constructors
    public SurveyRequest() {}
    
    // Getters and Setters
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    
    public Boolean getLikesPizza() { return likesPizza; }
    public void setLikesPizza(Boolean likesPizza) { this.likesPizza = likesPizza; }
    
    public Boolean getLikesPasta() { return likesPasta; }
    public void setLikesPasta(Boolean likesPasta) { this.likesPasta = likesPasta; }
    
    public Boolean getLikesPapAndWors() { return likesPapAndWors; }
    public void setLikesPapAndWors(Boolean likesPapAndWors) { this.likesPapAndWors = likesPapAndWors; }
    
    public Boolean getLikesChicken() { return likesChicken; }
    public void setLikesChicken(Boolean likesChicken) { this.likesChicken = likesChicken; }
    
    public Boolean getLikesBeef() { return likesBeef; }
    public void setLikesBeef(Boolean likesBeef) { this.likesBeef = likesBeef; }
    
    public Boolean getLikesOther() { return likesOther; }
    public void setLikesOther(Boolean likesOther) { this.likesOther = likesOther; }
    
    public Integer getEatOutRating() { return eatOutRating; }
    public void setEatOutRating(Integer eatOutRating) { this.eatOutRating = eatOutRating; }
    
    public Integer getWatchMoviesRating() { return watchMoviesRating; }
    public void setWatchMoviesRating(Integer watchMoviesRating) { this.watchMoviesRating = watchMoviesRating; }
    
    public Integer getWatchTvRating() { return watchTvRating; }
    public void setWatchTvRating(Integer watchTvRating) { this.watchTvRating = watchTvRating; }
    
    public Integer getListenToRadioRating() { return listenToRadioRating; }
    public void setListenToRadioRating(Integer listenToRadioRating) { this.listenToRadioRating = listenToRadioRating; }
}