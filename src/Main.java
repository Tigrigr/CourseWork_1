
public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee("Александров Александр Александрович", 1, 11000);
        Employee person2 = new Employee("Борисов Борис Борисович", 2, 22000);
        Employee person3 = new Employee("Владиславов Владислав Владиславович", 3, 33000);
        Employee person4 = new Employee("Геннадьев Геннадий Геннадьевич", 4, 44000);
        Employee person5 = new Employee("Дмитрьев Дмитрий Дмитриевич", 5, 55000);
        Employee person6 = new Employee("Жорьев Жора Жорьевич", 1, 66000);
        Employee person7 = new Employee("Костев Константин Константинович", 2, 77000);
        Employee person8 = new Employee("Леонидов Леонид Леонидович", 3, 88000);
        Employee person9 = new Employee("Михаилов Михаил Михаилович", 4, 99000);
        Employee person10 = new Employee("Николаев Николай Николаевич", 5, 100000);

        Employee[] employeesArray = new Employee[10];
        employeesArray[0] = person1;
        employeesArray[1] = person2;
        employeesArray[2] = person3;
        employeesArray[3] = person4;
        employeesArray[4] = person5;
        employeesArray[5] = person6;
        employeesArray[6] = person7;
        employeesArray[7] = person8;
        employeesArray[8] = person9;
        employeesArray[9] = person10;

//        Вызов методов для проверки

//        printEmployeesArray(employeesArray);
//        System.out.println(summSalaryInMonth(employeesArray));
//        System.out.println(findMinSalary(employeesArray));
//        System.out.println(findMaxSalary(employeesArray));
//        System.out.println(getAverageSalary(employeesArray));
//        printFullName(employeesArray);

    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей).
    public static void printEmployeesArray(Employee[] employeesArray) {
        for (Employee employee : employeesArray) {
            System.out.println(employee);
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static Integer summSalaryInMonth(Employee[] employeesArray) {
        int total = 0;
        for (Employee employee : employeesArray) {
            total += employee.getSalary();
        }
        return total;
    }

    // Найти сотрудника с минимальной зарплатой.
    public static String findMinSalary(Employee[] employeesArray) {
        int minSalary = Integer.MAX_VALUE;
        String fullName = "";
        for (Employee employee : employeesArray) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return "Минимальная зарплата у сотрудника " + fullName + ", в размере " + minSalary + " рублей.";
    }

    //Найти сотрудника с максимальной зарплатой.
    public static String findMaxSalary(Employee[] employeesArray) {
        int maxSalary = Integer.MIN_VALUE;
        String fullName = "";
        for (Employee employee : employeesArray) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return "Максимальная зарплата у сотрудника " + fullName + ", в размере " + maxSalary + " рублей.";
    }

    // Подсчитать среднее значение зарплат.
    public static Integer getAverageSalary(Employee[] employeesArray) {
        return summSalaryInMonth(employeesArray) / employeesArray.length;
    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль)
    public static void printFullName(Employee[] employeesArray) {
        for (Employee employee : employeesArray) {
            System.out.println(employee.getFullName());
        }
    }

}