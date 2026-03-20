package org.eternity.exam;

public class LectureReporter {

    private final FormatChecker formatChecker;
    private final StorageChecker storageChecker;

    public LectureReporter(FormatChecker formatChecker, StorageChecker storageChecker) {
        this.formatChecker = formatChecker;
        this.storageChecker = storageChecker;
    }

    public void report(Lecture lecture) throws Exception {
        // 포맷 변환
        String serialized = formatChecker.formatCheck(lecture);
        //  저장
        storageChecker.save(serialized);
    }
}
