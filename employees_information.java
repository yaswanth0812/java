class information  {

    private String name;
    private float salary;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(float salary){
        if(salary > 0)
            this.salary = salary;

    }

    public float getSalary(){
        return salary;
    }

}
public class employees_information{
    public static void main(String[] args) {
        information name = new information();
        information salary = new information();

        name.setName("yaswanth");
        System.out.println(name.getName());


        salary.setSalary(-1500);
        System.out.println(salary.getSalary());
    }

}