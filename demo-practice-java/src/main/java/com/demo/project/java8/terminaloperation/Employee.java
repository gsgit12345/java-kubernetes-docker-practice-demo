package com.demo.project.java8.terminaloperation;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.text.DecimalFormat;

@Data

@NoArgsConstructor
public class Employee implements Serializable {

    public String name;
    public Integer age;
    public Double salary;

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Getters and Setters of name, age & salary go here

    public String toString(){
        DecimalFormat dformat = new DecimalFormat(".##");
        return "Employee Name:"+this.name
                + "  Age:"+this.age
                + "  Salary:"+dformat.format(this.salary);
    }
    //Standard equals() and hashcode() implementations go here
}

