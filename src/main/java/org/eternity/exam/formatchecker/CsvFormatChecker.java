package org.eternity.exam.formatchecker;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.eternity.exam.FormatChecker;
import org.eternity.exam.Lecture;

public class CsvFormatChecker implements FormatChecker {

    @Override
    public String formatCheck(Lecture lecture) throws Exception {
        CsvMapper mapper = new CsvMapper();
        mapper.registerModule(new JavaTimeModule());
        CsvSchema schema = mapper.schemaFor(Lecture.class).withHeader();
        return mapper.writer(schema).writeValueAsString(lecture);
    }
}
