package com.java.learning.JavaSpringHandsOn.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
@Getter
@Setter
@Builder
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, city);
    }

}
