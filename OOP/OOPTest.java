class OOPTest {
    public static void main(String[] args){
        /*OOP test = new OOP();

        test.Person(10, "Ed");
        test.Person(120, "Ld");

        test.Person2();
        test.Person2(120, "Ld", 33);*/

        OOP person1 = new OOP(10, "Person1");
        OOP person2 = new OOP(5, "Person2");
        person1.objectMethods(person2);
    }
}
