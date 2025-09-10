package date_10_09;
public class empolyee_Management_System {
    private static String Companyname;
    private String name;
    private String designation;
    private final int id;
    private static int totalemployes=0;
    empolyee_Management_System(String name,String designation,int id){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalemployes++;
    }
    private static void displayTotalEmployees(){
        System.out.println("total employees is:"+totalemployes);

    }
    private static void setCompanyname(String companyname) {
        Companyname = companyname;
    }
    private void displayDetails(){
        if(this instanceof empolyee_Management_System){
            System.out.println("employee Name:"+name);
            System.out.println("desgination"+designation);
            System.out.println("employee id:"+id);
        }
        else{
            System.out.println("invalid employee details");
        }
    }


    public static void main(String[] args) {
        empolyee_Management_System.setCompanyname("google");
        empolyee_Management_System e1=new empolyee_Management_System("mohit", "mathura",42);
        empolyee_Management_System e2=new empolyee_Management_System("madhav", "mistri",37);
        displayTotalEmployees();
        e1.displayDetails();
        e2.displayDetails();

    }
}