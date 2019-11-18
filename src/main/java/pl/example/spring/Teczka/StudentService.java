package pl.example.spring.Teczka;
import io.vavr.collection.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.example.spring.Teczka.db.StudentRepository;
import io.vavr.collection.List;
import pl.example.spring.Teczka.db.StudentRow;

import java.util.function.Function;

@Service
public class StudentService
{

    private final StudentRepository repository;

    public StudentService(StudentRepository repository)
    {
        this.repository=repository;
    }

    List<Student> getStudents()
    {
        this.repository.findAll();
        return   List.ofAll(this.repository.findAll())
                .map(getStudentRowStudentFunction());
    }

    private Function<StudentRow, Student> getStudentRowStudentFunction() {
        return dbObj->
                new Student(
                        dbObj.getId(),
                        dbObj.getName(),
                        dbObj.getNumber(),
                        dbObj.getStud_group());
    }

    Student addStudent(final NewStudent newStudent)
    {
       // Student created = new Student(students.size()+1,newStudent.name, newStudent.number, newStudent.stud_group);
       // students = students.prepend(created);
       // return created;
        //throw new UnsupportedOperationException();
        StudentRow created= this.repository.save(new StudentRow
                (newStudent.name,
                newStudent.number,
                newStudent.stud_group));

        return getStudentRowStudentFunction().apply(created);
    }
}
