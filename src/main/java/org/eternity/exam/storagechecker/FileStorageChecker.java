package org.eternity.exam.storagechecker;

import org.eternity.exam.StorageChecker;

import java.io.FileWriter;

public class FileStorageChecker implements StorageChecker {

    @Override
    public void save(String serialized) throws Exception {
        try (FileWriter writer = new FileWriter("lecture_data.txt")) {
            writer.write(serialized);
        }
    }
}
