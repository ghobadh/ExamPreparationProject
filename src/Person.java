public class Person {
    static String name = "unknown"; //Class var
    String instanceName = "unknown"; //Instancce Var
    String age = "23"; //Instance var initialized



    public Person(){}

    public Person(String age){

        age = age; // in this constructor , the person instance age does NOT get set at all because age not qualified by 'this' .
    }


    public Person(String name, String age){
        this.age = age;

        this.instanceName = Person.name = name; //setting static veriable name in same assignment statement

    }

    public void setAge(String age){
        this.age = age;
    }

    public void setInstanceName (String instanceName){
        this.instanceName = instanceName;
    }


    public String toString(){
        return instanceName + " is " + age +" years old (Person.name= " + name + ")";
    }
}
