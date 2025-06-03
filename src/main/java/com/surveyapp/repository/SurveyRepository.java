package com.surveyapp.repository;

import com.surveyapp.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    
    @Query("SELECT AVG(s.age) FROM Survey s")
    Double findAverageAge();
    
    @Query("SELECT MAX(s.age) FROM Survey s")
    Integer findMaxAge();
    
    @Query("SELECT MIN(s.age) FROM Survey s")
    Integer findMinAge();
    
    @Query("SELECT COUNT(s) FROM Survey s WHERE s.likesPizza = true")
    Long countByLikesPizzaTrue();
    
    @Query("SELECT AVG(s.eatOutRating) FROM Survey s")
    Double findAverageEatOutRating();
}