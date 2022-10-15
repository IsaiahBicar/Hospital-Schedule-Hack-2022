import java.util.Scanner;

public class Department {
    private String deptName;
    private int numNurses;
    private int maxNurseCapacity;
    private int minNurseCapacity;
    public Department( String deptName, int numNurses, int maxNurseCapacity, int minNurseCapacity){

    }
    public int getMaxNurseCapacity() {
        return maxNurseCapacity;
    }

    public int getNumNurses() {
        return numNurses;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setMaxNurseCapacity(int maxNurseCapacity) {
        this.maxNurseCapacity = maxNurseCapacity;
    }

    public void setNumNurses(int numNurses) {
        this.numNurses = numNurses;
    }

    public static void display(Department department) {
        System.out.println(department.deptName);
        System.out.println(department.maxNurseCapacity);
        System.out.println(department.minNurseCapacity);
        System.out.println(department.numNurses);

    }
    public static void main(String[] args){
        Department department = new Department("ICU", 10, 15, 5 );
        display(department);
    }
}



