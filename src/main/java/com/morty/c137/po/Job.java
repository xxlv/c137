package com.morty.c137.po;

import javax.persistence.Id;
import java.io.Serializable;

public class Job implements Serializable {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
