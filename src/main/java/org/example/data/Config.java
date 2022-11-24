package org.example.data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Config implements Serializable {
    @JsonProperty("paths")
    private List<Path> paths = null;

    private final static long serialVersionUID = -4172230119956589051L;

    @JsonProperty("paths")
    public List<Path> getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }
}
