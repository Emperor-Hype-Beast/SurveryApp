package com.surveyapp.service;

import com.surveyapp.dto.SurveyRequest;
import com.surveyapp.dto.SurveyStats;
import com.surveyapp.model.Survey;
import com.surveyapp.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {
    
    @Autowired
    private SurveyRepository surveyRepository;
    
    public Survey saveSurvey(SurveyRequest request) {
        Survey survey = new Survey();
        survey.setSurname(request.getSurname());
        survey.setFirstName(request.getFirstName());
        survey.setContactNumber(request.getContactNumber());
        survey.setAge(request.getAge());
        survey.setDate(request.getDate());
        survey.setLikesPizza(request.getLikesPizza());
        survey.setLikesPasta(request.getLikesPasta());
        survey.setLikesPapAndWors(request.getLikesPapAndWors());
        survey.setLikesChicken(request.getLikesChicken());
        survey.setLikesBeef(request.getLikesBeef());
        survey.setLikesOther(request.getLikesOther());
        survey.setEatOutRating(request.getEatOutRating());
        survey.setWatchMoviesRating(request.getWatchMoviesRating());
        survey.setWatchTvRating(request.getWatchTvRating());
        survey.setListenToRadioRating(request.getListenToRadioRating());
        
        return surveyRepository.save(survey);
    }
    
    public SurveyStats getSurveyStats() {
        Long totalSurveys = surveyRepository.count();
        
        if (totalSurveys == 0) {
            return new SurveyStats(0L, 0.0, 0, 0, 0.0, 0.0);
        }
        
        Double averageAge = surveyRepository.findAverageAge();
        Integer oldestPerson = surveyRepository.findMaxAge();
        Integer youngestPerson = surveyRepository.findMinAge();
        Long pizzaLovers = surveyRepository.countByLikesPizzaTrue();
        Double pizzaPercentage = (pizzaLovers.doubleValue() / totalSurveys.doubleValue()) * 100;
        Double averageEatOutRating = surveyRepository.findAverageEatOutRating();
        
        return new SurveyStats(totalSurveys, averageAge, oldestPerson, 
                              youngestPerson, pizzaPercentage, averageEatOutRating);
    }
}