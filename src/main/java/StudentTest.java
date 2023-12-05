

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by meudecc on 15/02/2017.
 */
public class StudentTest {
    @Test
    public void testBelowZero() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-1);
        });
    }

    @Test
    public void testMuchBelowZero(){
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(-42);
        });
    }

    @Test
    public void testAbove100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(101);
        });
    }

    @Test
    public void testMuchAbove100() {
        Student std = new Student();
        assertThrows(IllegalArgumentException.class, () -> {
            std.getAttendanceGrade(142);
        });
    }

    @Test
    public void testAbsent() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.ABSENT, std.getAttendanceGrade(0));
    }

    @Test
    public void testLowVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(1));
    }

    @Test
    public void testHighVeryPoor() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(29));
    }

    @Test
    public void testLowAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(30));
    }

    @Test
    public void testHighAverage() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(69));
    }

    @Test
    public void testLowGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(70));
    }

    @Test
    public void testHighGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.GOOD, std.getAttendanceGrade(89));
    }

    @Test
    public void testLowVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(90));
    }

    @Test
    public void testHighVeryGood() {
        Student std = new Student();
        assertEquals(Student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(100));
    }
}