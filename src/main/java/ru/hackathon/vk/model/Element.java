package ru.hackathon.vk.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import ru.hackathon.vk.form.ElementForm;

import javax.persistence.*;

/**
 * Created by etovladislav on 26.11.16.
 */
@Entity
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean isTable;

    private String width;

    private String height;

    private String zIndex;

    private String x;

    private String y;

    private String cssClass;

    private String color;

    private String textureUrl;

    @ManyToOne
    @JsonIgnore
    private Zone zone;

    public Element(ElementForm elementForm) {
        this.isTable = elementForm.getTable();
        this.width = elementForm.getWidth();
        this.height = elementForm.getHeight();
        this.zIndex = elementForm.getzIndex();
        this.x = elementForm.getX();
        this.y = elementForm.getY();
        this.cssClass = elementForm.getCssClass();
        this.color = elementForm.getColor();
        this.textureUrl = elementForm.getTextureUrl();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextureUrl() {
        return textureUrl;
    }

    public void setTextureUrl(String textureUrl) {
        this.textureUrl = textureUrl;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getTable() {
        return isTable;
    }

    public void setTable(Boolean table) {
        isTable = table;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getzIndex() {
        return zIndex;
    }

    public void setzIndex(String zIndex) {
        this.zIndex = zIndex;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
}
