package com.sofka.Software.models;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "listaTarea")
public class ListTaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(unique = true, nullable = false)
    private Boolean completed;
    @Column(unique = true, nullable = false)
    private String name;

    /**
     * relacion muchos a uno , implementa la relacion con la clase primaria lista
     */
    @ManyToOne
    @JoinColumn(name = "list_id", referencedColumnName = "id")
    private ListModel list;

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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ListModel getList() {
        return list;
    }

    public void setList(ListModel list) {
        this.list = list;
    }

}
