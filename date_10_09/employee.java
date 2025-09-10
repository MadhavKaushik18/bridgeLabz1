package date_10_09;

public class employee {
	
		  private static String Companyname;
		    private String name;
		    private String designation;
		    private final int id;
		    private static int totalemployes=0;
		    employee(String name,String designation,int id){
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
		        if(this instanceof employee){
		            System.out.println("employee Name:"+name);
		            System.out.println("desgination"+designation);
		            System.out.println("employee id:"+id);
		        }
		        else{
		            System.out.println("invalid employee details");
		        }
		    }


		    public static void main(String[] args) {
		        employee.setCompanyname("google");
		        employee e1=new employee("mohit", "mathura",42);
		        employee e2=new employee("madhav", "mistri",37);
		        displayTotalEmployees();
		        e1.displayDetails();
		        e2.displayDetails();

		    }
		}
