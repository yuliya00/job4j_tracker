package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class Licenses {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Licenses licenses = (Licenses) o;
        return Objects.equals(owner, licenses.owner) && Objects.equals(model, licenses.model)
                && Objects.equals(code, licenses.code) && Objects.equals(created, licenses.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
