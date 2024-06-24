package DefiningClasses_Exercise_Company_Roster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");
            String name = employeeInfo[0];
            Double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String departmentName = employeeInfo[3];
            String email = "n/a";
            int age = -1;
            if (employeeInfo.length == 6) {
                email = employeeInfo[4];
                age = Integer.parseInt(employeeInfo[5]);
            } else if (employeeInfo.length == 5) {
                //Tina 333.33 Manager Marketing 33
                //Sam 840.20 ProjectLeader Development sam@sam.com
                if (employeeInfo[4].contains("@")) {
                    email = employeeInfo[4];
                } else {
                    age = Integer.parseInt(employeeInfo[4]);
                }
            }
            Employee employee = new Employee(name, salary, position, email, age);

            Department department = getDepartmentByName(departments, departmentName);
            department.addEmployee(employee);
        }
        Collections.sort(departments, Comparator.comparing(Department::getDepartmentSalary).reversed());
        Department highestPaidDepartment = departments.get(0);
        Collections.sort(highestPaidDepartment.getEmployees(), Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(highestPaidDepartment);


    }

    private static Department getDepartmentByName(List<Department> departments, String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)){
                return department;
            }

        }
        Department department = new Department(departmentName);
        departments.add(department);
        return department;

    }
}
