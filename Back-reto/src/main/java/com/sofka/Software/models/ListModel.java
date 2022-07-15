package com.sofka.Software.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;


@Data
@Entity
@Table(name = "lista")
public class ListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "list")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonIgnoreProperties("list")
    private List<ListTaskModel>ListTask = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ListTaskModel> getTodos() {
        return ListTask;
    }

    public void setTodos(List<ListTaskModel> todos) {
        this.ListTask = todos;
    }




}
