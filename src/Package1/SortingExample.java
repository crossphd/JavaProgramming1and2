package Package1;

import java.util.*;
import java.lang.*;
import java.io.*;


public class SortingExample
{
    public static void main ( String [] args) throws IOException
    {

        Employee empList[] = new Employee [4];

        empList[0] = new Employee (8,"Kiran","Developer",15000);
        empList[1] = new Employee (18,"Krishna","DBA",35000);
        empList[2] = new Employee (3,"Pradeep","Tester",25000);
        empList[3] = new Employee (7,"Mithun","Admin",20000);


        Arrays.sort(empList);
        System.out.println("\nAfter Sorting Base On ID");
        for (Employee emp : empList)
            System.out.println(emp);


        Arrays.sort( empList , new EmployeeByDept() );
        System.out.println("\nAfter Sorting Base On Department");
        for (Employee emp : empList)
            System.out.println(emp);


        Arrays.sort( empList , new EmployeeByName() );
        System.out.println("\nAfter Sorting Base On Name");
        for (Employee emp : empList)
            System.out.println(emp);


        Arrays.sort( empList , new EmployeeBySalary() );
        System.out.println("\nAfter Sorting Base On Salary");
        for (Employee emp : empList)
            System.out.println(emp);

    }
}

class EmployeeByDept implements Comparator<Employee>
{
    //compare() is mathod of Comparable Interface
    // Use When we want to sort on other field like Department
    @Override
    public int compare(Employee emp1, Employee emp2)
    {
        return emp1.getDept().compareTo(emp2.getDept());
    }

}

class EmployeeByName implements Comparator<Employee>
{
    //compare() is mathod of Comparable Interface
    // Use When we want to sort on other field like Department
    @Override
    public int compare(Employee emp1, Employee emp2)
    {
        return emp1.getName().compareTo(emp2.getName() );
    }

}

class EmployeeBySalary implements Comparator<Employee>
{
    //compare() is mathod of Comparable Interface
    // Use When we want to sort on other field like Department
    @Override
    public int compare(Employee emp1, Employee emp2)
    {
        return ( emp1.getSalary() - emp2.getSalary());
    }

}



class Employee implements Comparable<Employee>
{
    int $id  ;
    String $name ;
    String $dept ;
    int $salary ;

    public Employee(int id , String name , String dept , int salary)
    {
        this.$id = id;
        this.$name = name ;
        this.$dept = dept ;
        this.$salary = salary ;
    }


    public int getID () { return this.$id ; }
    public String getName () { return this.$name ; }
    public String getDept () { return this.$dept ; }
    public int getSalary () { return this.$salary ; }

    public String toString()
    {
        return  "[ "
                + "ID :: " + $id
                + " Name :: " + $name
                + " Department :: " + $dept
                + " Salary :: " + $salary
                + " ]";

    }

    //compareTo() is method of Comparable Interface
    //Use when you want natural sorting base on ID , Salary

    @Override
    public int compareTo(Employee emp)
    {
        return (this.$id - emp.$id);
    }


}