package org.example.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Path implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("path")
    private String path;

    private final static long serialVersionUID = 5815322938723706625L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }
}
