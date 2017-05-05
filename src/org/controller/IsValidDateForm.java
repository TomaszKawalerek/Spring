package org.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=DateFormValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidDateForm {
	
	String listOfValidHobbies();
	String message()default "Please provide a valid Date";
	Class<?>[]groups() default{};
	Class<? extends Payload>[]payload() default{};
	
	
}
