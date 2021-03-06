package com.example.evirn_sci_survey.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface SurveyDao {
        @Insert
        void insert(Survey survey);

        @Update
        void update(Survey survey);

        @Delete
        void delete(Survey survey);

        @Query("DELETE FROM survey")
        void deleteAll();

        @Query(" SELECT * FROM survey ORDER BY startDate, endDate")
        LiveData<List<Survey>> getSurveyByDate();

        @Query("SELECT * FROM survey WHERE surveyId = :surveyId")
        Survey getSurveyFromId(int surveyId);

        @Query("SELECT * FROM survey")
        List<Survey> getAllSurveys();
}
