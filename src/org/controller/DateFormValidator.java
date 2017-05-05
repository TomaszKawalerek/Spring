package org.controller;

import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateFormValidator implements ConstraintValidator<IsValidDateForm, String> {


	@Override
	public boolean isValid(String studentDOB, ConstraintValidatorContext std) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (studentDOB == null) {
			return false;
		}
		if (studentDOB.matches(sdf.toString())) {
			return true;
		} else
			return false;
	}

	@Override
	public void initialize(IsValidDateForm isValidDateForm) {
		// TODO Auto-generated method stub
		
	}

}
