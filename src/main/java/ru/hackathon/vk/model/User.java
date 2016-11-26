package ru.hackathon.vk.model;

import javax.persistence.*;

/**
 * Created by etovladislav on 26.11.16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "id_vk")
    private String idVk;

    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdVk() {
        return idVk;
    }

    public void setIdVk(String idVk) {
        this.idVk = idVk;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
