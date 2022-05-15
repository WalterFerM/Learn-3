public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(27);
        System.out.println(person.getAge());

        person.setName("Walter");
        System.out.println(person.getName());

        person.setPhone(123456);
        System.out.println(person.getPhone());
    }
}

class Person {
    private int age;
    private String name;
    private int phone;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }
}
