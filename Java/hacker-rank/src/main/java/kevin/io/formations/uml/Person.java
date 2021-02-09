package kevin.io.formations.uml;


public class Person {

    private String name;
    private String address;
    private int age;

    public boolean isNameLengthCorrect() {
        return this.name.trim().length() >= 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() throws Exception {
        if (isNameLengthCorrect()) return this.name;

        throw new Exception("Name Length is not correct");
    }

}