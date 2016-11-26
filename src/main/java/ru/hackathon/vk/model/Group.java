package ru.hackathon.vk.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by etovladislav on 26.11.16.
 */
@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //public133944573
    @Column(name = "group_vk_id")
    private String groupVkId;

    //28426054
    @Column(name = "administrator_vk_id")
    private String administratorVkId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Zone> zones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupVkId() {
        return groupVkId;
    }

    public void setGroupVkId(String groupVkId) {
        this.groupVkId = groupVkId;
    }

    public String getAdministratorVkId() {
        return administratorVkId;
    }

    public void setAdministratorVkId(String administratorVkId) {
        this.administratorVkId = administratorVkId;
    }
}
