package com.softura.healthcareapi.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Role_Id")
    private int roleId;
    @Column(name="Role_Name",length = 50)
    private String roleName;
    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private List<UserAccount> userList;

}
