package com.surveyapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "surveys")
public class Survey {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Surname is required")
    @Column(nullable = false)
    private String surname;
    
    @NotBlank(message = "First name is required")
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @NotBlank(message = "Contact number is required")
    @Column(name = "contact_number", nullable = false)
    private String contactNumber;
    
    @NotNull(message = "Age is required")
    @Min(value = 5, message = "Age must be at least 5")
    @Max(value = 120, message = "Age must not exceed 120")
    @Column(nullable = false)
    private Integer age;
    
    @NotNull(message = "Date is required")
    @Column(nullable = false)
    private LocalDate date;
    
    @Column(name = "likes_pizza", nullable = false)
    private Boolean likesPizza = false;
    
    @Column(name = "likes_pasta", nullable = false)
    private Boolean likesPasta = false;
    
    @Column(name = "likes_pap_and_wors", nullable = false)
    private Boolean likesPapAndWors = false;
    
    @Column(name = "likes_chicken", nullable = false)
    private Boolean likesChicken = false;
    
    @Column(name = "likes_beef", nullable = false)
    private Boolean likesBeef = false;
    
    @Column(name = "likes_other", nullable = false)
    private Boolean likesOther = false;
    
    @NotNull(message = "Eat out rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    @Column(name = "eat_out_rating", nullable = false)
    private Integer eatOutRating;
    
    @NotNull(message = "Watch movies rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    @Column(name = "watch_movies_rating", nullable = false)
    private Integer watchMoviesRating;
    
    @NotNull(message = "Watch TV rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    @Column(name = "watch_tv_rating", nullable = false)
    private Integer watchTvRating;
    
    @NotNull(message = "Listen to radio rating is required")
    @Min(value = 1, message = "Rating must be between 1 and 5")
    @Max(value = 5, message = "Rating must be between 1 and 5")
    @Column(name = "listen_to_radio_rating", nullable = false)
    private Integer listenToRadioRating;
    
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
    
    // Constructors
    public Survey() {}
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
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
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}