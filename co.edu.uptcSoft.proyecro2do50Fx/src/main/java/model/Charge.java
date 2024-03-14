package model;

import java.io.Serializable;

public class Charge implements Serializable {

    //Atributos
    private String description;
    private String origin;
    private String destination;
    private Double value;
    private String id;

    //


    public Charge(String description, String origin, String destination, Double value, String id) {
        this.description = description;
        this.origin = origin;
        this.destination = destination;
        this.value = value;
        this.id = id;
    }

    public Charge() {

    }

    //get and set
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //
    @Override
    public String toString() {
        return "Id: " + this.id + ", Descripción: " + this.description + ", Origen: " + this.origin + ", Destino: " + this.destination + ", Precio: " + this.value;
    }
}
