package org.eternity.exam.storagechecker;

import org.eternity.exam.StorageChecker;
import org.springframework.jdbc.core.simple.JdbcClient;

public class DatabaseStorageChecker implements StorageChecker {

    private final JdbcClient jdbcClient;

    public DatabaseStorageChecker(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public void save(String serialized) throws Exception {
        jdbcClient.sql("INSERT INTO LECTURE(SERIALIZED_DATA) VALUES(?)")
                .param(1, serialized)
                .update();
    }
}
