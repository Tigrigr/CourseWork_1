import java.util.Objects;

public class Employee {
    private final String fullName;

    private final Integer personID;

    private Integer departamentID;

    private Integer salary;

    private static Integer counterID = 1;

    public Employee(String fullName, Integer departamentID, Integer salary) {
        this.fullName = fullName;
        this.personID = counterID++;
        this.departamentID = departamentID;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getPersonID() {
        return personID;
    }

    public Integer getDepartamentID() {
        return departamentID;
    }

    public void setDepartamentID(Integer departamentID) {
        this.departamentID = departamentID;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "ФИО: " + fullName +
                ", Идентификатор: " + personID +
                ", Отдел: " + departamentID +
                ", Зарплата: " + salary +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(personID, employee.personID) && Objects.equals(departamentID, employee.departamentID) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, personID, departamentID, salary);
    }
}
