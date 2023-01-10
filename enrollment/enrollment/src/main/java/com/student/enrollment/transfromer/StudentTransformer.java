package com.student.enrollment.transfromer;
 
import com.student.enrollment.model.Student;

import org.springframework.stereotype.Component;

@Component
public class StudentTransformer {
    public static Student transform(Student dbStudent, Student studentToUpdate){
		/*
		 * if(rateToUpdate.getRateDescription() != null){
		 * dbRate.setRateDescription(rateToUpdate.getRateDescription()); }
		 * if(rateToUpdate.getRateEffectiveDate() != null){
		 * dbRate.setRateEffectiveDate(rateToUpdate.getRateEffectiveDate()); }
		 * if(rateToUpdate.getRateEffectiveDate() !=null){
		 * dbRate.setRateEffectiveDate(rateToUpdate.getRateExpirationDate()); }
		 * if(rateToUpdate.getAmount() !=null){
		 * dbRate.setAmount(rateToUpdate.getAmount()); }
		 */
        return dbStudent;
    }
}
