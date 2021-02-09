package kevin.io.formations.uml;


public class Person {

    private String name;
    private String address;
    private int age;

    public String getName() throws Exception {
        if (!isNameLengthCorrect()) throw new Exception("Name Length is not correct");

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNameLengthCorrect() {
        return this.name.trim().length() >= 5;
    }
}