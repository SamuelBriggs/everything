package Chapter8.TimeClassExercise;

public class Employee {

    private String firstName;
    private String lastName;
    private DateClass birthDate;
    private DateClass hireDate;

    public Employee(String firstName, String lastName, DateClass birthDate, DateClass hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String tString(){
        return String.format("%s, %s, Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }

}
