package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.data.Config;
import org.example.data.Path;

import java.io.File;
import java.io.IOException;

public class Main {
    /**
     * Reference to config file.
     */
    public static final String CONFIG_FILE = "src/main/resources/config.json";

    /**
     * Config data deserialized.
     */
    private static Config configData;

    /**
     * Starting point.
     *
     * @param args args.
     */
    public static void main(String[] args) throws IOException {
        configData = loadConfig();
        Path pathData = getPathConfig(PathEnum.PATH_1);
        assert pathData.getPath() == "/my/first/path";
    }

    /**
     * Load config file
     *
     * @throws IOException JSON document could not be loaded.
     */
    private static Config loadConfig() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(CONFIG_FILE), Config.class);
    }

    /**
     * Get path data for the path id provided.
     *
     * @param path Path ID.
     * @return Path data.
     */
    public static Path getPathConfig(PathEnum path) {
        for (Path config : configData.getPaths()) {
            if (config.getId().equals(path.name())) {
                return config;
            }
        }
        return null;
    }
}