package com.epolTask.userList.service;

import com.epolTask.userList.dto.UserBaseInfo;
import com.epolTask.userList.dto.UserRegInfo;
import com.epolTask.userList.model.Car;
import com.epolTask.userList.repository.CarRepository;
import com.epolTask.userList.repository.RoleRepository;
import com.epolTask.userList.repository.UserRepository;
import com.epolTask.userList.model.Role;
import com.epolTask.userList.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private SecurityService securityService;



    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User addUser(UserRegInfo userRegInfo) {
        User user = new User(userRegInfo);

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        HashSet<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findRoleByPrivilege("USER");
        roles.add(userRole);
        user.setRoles(roles);
        return userRepository.save(user);
    }

    @Override
    public void addCarToUser(Long id) {
        User user = getLoggedInUser();
        System.out.println(user);
        HashSet<Car> cars = new HashSet<>();
        Car userCar = carRepository.findCarById(id);
        cars.add(userCar);
        System.out.println(userCar);
        user.getCars().add(userCar);
        System.out.println(user);
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getLoggedInUser() throws DataAccessException {
        return findByUsername(securityService.findLoggedInUsername());
    }
}
