package sunny.sunny_juju_review.model;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name="test")
@Entity
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    public TestEntity(String name,Integer age) {
        this.age = age;
        this.name = name;
    }

    public TestEntity(){

    }
    public void changeNameAndAge(String name, Integer age){
        this.name=name;
        this.age=age;
    }
}
