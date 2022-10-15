import java.util.Scanner;

public class Department {
    private String deptName;
    private int numNurses;
    private int maxNurseCapacity;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter department name: ");

    }
}



