package model;
import util.Util;
import lombok.*;


@Getter @Setter
public class Model {
    private String name;
    public Model(String name) {
        this.name = name;
        System.out.println(Util.saudacao(name));
    }
}