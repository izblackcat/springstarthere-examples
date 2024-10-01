package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Parrot {

    private String name = "Kikio";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "beans.Parrot[name=" + this.name + "]";
    }
}
