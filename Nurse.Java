public class Nurse{
    private String name;
    private int id;
    private String department;
    private String position;

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }

    public void updatePostion( String newPostion){
        this.position = newPostion;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }
// hello test hello
    
}
