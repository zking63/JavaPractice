class OOP {
    //testing out "this" to differentitate bw parameter and member variables
    private int age;
    private String name;
    /*public void Person(int age, String name) {
        //this.age = ageParam;
        //this.name = nameParam;
        this.age = age;
        this.name = name;
        System.out.println(age + name);
    }

    //testing out "this" to override constructors 
    private int cmHeight;
    public void Person2() {
        age = 20;
        name = "John";
        cmHeight = 0;
        //this(20, "John Doe", 171);
        System.out.println(age + name + cmHeight);
    }
        
    public void Person2(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
        System.out.println(age + name + cmHeight);
    }*/

    //Object superclass
    public OOP(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }
    public void objectMethods(OOP anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}
