package com.epolTask.userList.repository;

import com.epolTask.userList.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
