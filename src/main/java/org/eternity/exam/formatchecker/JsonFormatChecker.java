package org.eternity.exam.formatchecker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.eternity.exam.FormatChecker;
import org.eternity.exam.Lecture;

public class JsonFormatChecker implements FormatChecker {

    @Override
    public String formatCheck(Lecture lecture) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.writeValueAsString(lecture);
    }
}
