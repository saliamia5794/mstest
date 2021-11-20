package zack.ms.first.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zack.ms.first.enums.Sex;

import javax.persistence.*;
import java.util.Date;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  @Column(name="FIRST_NAME")
  private String firstName;
  private Date birthDay;
  @Enumerated(EnumType.STRING)
  private Sex sexEnum;

  private int age;

  private double salaire;



}
