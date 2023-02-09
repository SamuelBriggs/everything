package tdd.Chapter8Exercises;

import Chapter8.TimeClassExercise.DateClass;
import Chapter8.TimeClassExercise.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DateClassTest {

    private DateClass currentDate;
    private Employee employee;
    @BeforeEach
    public void setUp(){
        currentDate = new DateClass(7, 25,1996);
        DateClass birth = new DateClass(6, 5, 1445);
        DateClass hire = new DateClass(4,5,2009);

        employee = new Employee("Samuel", "Alawode", birth, hire);

    }
    @Test
    public void checkIfDateExists(){
        assertNotNull(currentDate);
    }

    @Test

    public void printDate(){
        System.out.println(currentDate.toString());
        System.out.println(employee.toString());
    }

}
