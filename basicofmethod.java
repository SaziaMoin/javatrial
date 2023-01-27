public class basicofmethod {  // methods name(class name)
    int age = 20;  //they are instance variables because it belongs to objects
    private String name = "sazia moin";  // it is used when variable is private
    String course = "bca";

    public String getname()  // it is used when variable is private
    {
        return name;
    }
    // if you want to change the value of age
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }
}

    class student{
        public static void main(String[] args) {
            int n=3;  //local variable
            basicofmethod obj=new basicofmethod();
            System.out.println(obj.getname());
            System.out.println(obj.course);
            System.out.println(obj.age);

            obj.setAge(35);
            System.out.println(obj.getAge());

        }
    }
