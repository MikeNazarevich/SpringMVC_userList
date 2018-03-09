package com.epolTask.userList.service;

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
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private CarService carService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private CarRepository carRepository;

    public User getLoggedInUser() throws DataAccessException {
        return findByUsername(securityService.findLoggedInUsername());
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.delete(id);
    }

    @Override
    public void addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        HashSet<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findRoleByPrivilege("USER");
        System.out.println(userRole);
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public void addCar(Long id) {
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

    public boolean isAdmin(User user) {
        Role role = roleRepository.findRoleByPrivilege("ADMIN");
        return user.getRoles().contains(role);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
