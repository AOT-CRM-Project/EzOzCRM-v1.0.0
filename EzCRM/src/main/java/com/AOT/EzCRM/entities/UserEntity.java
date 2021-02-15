package com.AOT.EzCRM.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    @GenericGenerator(name =  "uuid2", strategy = "uuid2")
  //  @Type(type="uuid-binary")
    private UUID id;

    @Column(name ="first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "password", unique = false, nullable = false)
    private  String password;
}
