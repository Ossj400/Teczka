package pl.example.spring.Teczka;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;
import pl.example.spring.Teczka.db.StudentRepository;
import io.vavr.collection.List;

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
        //List.ofAll(this.repository.findAll()).map();
        throw new UnsupportedOperationException();
    }


    Student addStudent(final NewStudent newStudent)
    {
       // Student created = new Student(students.size()+1,newStudent.name, newStudent.number, newStudent.stud_group);
       // students = students.prepend(created);
       // return created;
        throw new UnsupportedOperationException();
    }
}
