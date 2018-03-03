package com.epolTask.userList.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "user_car",
                joinColumns = @JoinColumn(name = "car_id"),
                inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> owners;

    @Column(name = "photo")
    private String photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getOwners() {
        return owners;
    }

    public void setOwners(Set<User> owners) {
        this.owners = owners;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(id, car.id) &&
//                Objects.equals(name, car.name) &&
//                Objects.equals(owners, car.owners) &&
//                Objects.equals(photo, car.photo);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, name, owners, photo);
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//
//    public Car(String name, String photo) {
//        this.name = name;
//        this.photo = photo;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
