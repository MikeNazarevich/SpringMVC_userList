//package com.epolTask.userList.config;
//
//
//import com.epolTask.userList.validator.UniqueUsernameValidator;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target({ElementType.METHOD, ElementType.FIELD})
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = UniqueUsernameValidator.class)
//public @interface UniqueUsername {
//    String message() default "{com.epolTask.userList.config.UniqueLogin.message}";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//
//}
