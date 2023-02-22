package hello.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("test");
        helloLombok.setAge(10);

        String name = helloLombok.getName();
        System.out.println(name);
        System.out.printf("%d", helloLombok.getAge());
        System.out.println(helloLombok);
    }
}
