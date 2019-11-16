package pl.example.spring.Teczka;


import org.junit.Test;
import io.vavr.collection.List;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.example.spring.Teczka.db.StudentRepository;

import static org.junit.Assert.*;

public class studentServiceTest
{
    //@RunWith(SpringRunner.class)
   // @SpringBootTest
    @Test
    public void getEmptyList() {
       // final StudentService service = new StudentService(repository); ODKOMENTOWA TA LINIJKE
        //final StudentService service = new StudentService();
       // List<Student> students = service.getStudents();
        //assertTrue(students.isEmpty());
    }

    public class StudentServiceTest
    {
        @Autowired
        private StudentRepository repository;
    }

    @Test
    public void addStudent()
    {
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent(1,"Student1","IP","1"));
        assertNotNull(created);
    }

    @Test
    public void addStudentIsReturned()
    {
       final StudentService service = new StudentService();
       final Student student = service.addStudent(new NewStudent(1, "a", "b", "c"));
        final List<Student> all = service.getStudents();
        assertEquals(1, all.get(0).id);

        assertEquals(all.get().id, student.id);
        assertEquals(all.get().name, student.name);
        assertEquals(all.get().number, student.number);
        assertEquals(all.get().stud_group, student.stud_group);
    }

    @Test
    public void addStudentHasNewId()      // Double test
    {
        final StudentService service = new StudentService();
        service.addStudent(new NewStudent(1, "a", "b", "c"));
        service.addStudent(new NewStudent(1, "b", "b", "c"));
        final List<Student> all = service.getStudents();
        assertEquals(2,service.getStudents().size());
        assertNotEquals(all.get(0).id,all.get(1).id);
    }




}