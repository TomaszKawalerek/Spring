package org.controller;

import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;



	@Documented
	@Constraint(validatedBy=HobbyValidator.class)
	@Target({ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface IsValidHobby{
		String message()default "Please provide a valid Hobby;"+
	"accepted hobbies are - Music, Football, Cricket and Hockey (choose anyone)";
		Class<?>[]groups() default{};
		Class<?extends Payload>[]payload() default{};
	}
	

