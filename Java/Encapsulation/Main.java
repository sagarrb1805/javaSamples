class Employee{
    private String name;
    private int empCode;
    static String designation;
    
    public void setempCode(int empCode){
        this.empCode = empCode;
    }

    public int getempCode(){
        return this.empCode;
    }

    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }

    public static void getEmployerName(){
        System.out.println("EY");
    }

    static {
        designation = "SDE";
    }

}

public class Main{
    public static void main(String[] args) {
        System.out.println(Employee.designation);
        Employee emp = new Employee();
        emp.setName("name of emp");
        emp.getName();
        // System.out.println(emp.empCode);     Encapsulated variable 

    }
    
}