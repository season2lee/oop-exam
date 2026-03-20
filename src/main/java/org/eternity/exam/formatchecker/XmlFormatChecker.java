package org.eternity.exam.formatchecker;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.eternity.exam.FormatChecker;
import org.eternity.exam.Lecture;

public class XmlFormatChecker implements FormatChecker {

    @Override
    public String formatCheck(Lecture lecture) throws Exception {
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.writeValueAsString(lecture);
    }
}
