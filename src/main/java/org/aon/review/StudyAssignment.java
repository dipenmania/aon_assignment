package org.aon.review;

public class StudyAssignment {

    boolean checkStudy(Student student) {
        if (student.isLoggedIn()) {
            if (student.getTeacherName() == "Lee") {
                if (student.isEnrolledInMaths()) {
                    if (student.hasDistinction())
                        return true;
                }
            }
        }
        return false;
    }

    //Better way to write

    boolean checkStudyBetter(Student student) {

        if (student == null) return false;

        return student.isLoggedIn() &&
                "Lee".equals(student.getTeacherName()) &&
                student.isEnrolledInMaths() &&
                student.hasDistinction();

    }
}