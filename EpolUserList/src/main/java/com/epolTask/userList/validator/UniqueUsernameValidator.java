//package com.epolTask.userList.validator;
//
//import com.epolTask.userList.config.UniqueUsername;
//import com.epolTask.userList.repository.UserRepository;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
//    private UserRepository userRepository;
//
//    public UniqueUsernameValidator(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public void initialize(UniqueUsername constraint) {
//    }
//
//    public boolean isValid(String login, ConstraintValidatorContext context) {
//        return login != null && !userRepository.findByUsername(login).isPresent();
//    }
//}
