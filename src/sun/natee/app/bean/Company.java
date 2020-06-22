package sun.natee.app.bean;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private int id;
    private String name;
    private final List<Shop> listBranch;

    public Company() {
        listBranch = new ArrayList<>();
    }

    public List<Shop> getListBranch() {
        return listBranch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
