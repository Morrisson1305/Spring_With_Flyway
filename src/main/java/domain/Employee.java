package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Integer age;
    @Column(nullable = false)
    private String department;
    private String jobTitle;
    @Column(nullable = false, updatable = false)
    private String staffID;
    @Column(nullable = false)
    private String position;

}
