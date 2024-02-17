package model;

public class Charge {

    //Atributos
    private String description;
    private String origin;
    private String destination;
    private Double value;
    private User transport;
    private User oferent;

    //
    public Charge(String description, String origin, String destination, Double value, User transport, User oferent) {
        this.description = description;
        this.origin = origin;
        this.destination = destination;
        this.value = value;
        this.transport = transport;
        this.oferent = oferent;
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

    public User getTransport() {
        return transport;
    }

    public void setTransport(User transport) {
        this.transport = transport;
    }
    public User getOferent() {
        return oferent;
    }

    public void setOferent(User oferent) {
        this.oferent = oferent;
    }

    //
    @Override
    public String toString() {
        return "Charge{" +
                "description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", value=" + value +
                ", transport=" + transport +
                ", oferent=" + oferent +
                '}';
    }
}
