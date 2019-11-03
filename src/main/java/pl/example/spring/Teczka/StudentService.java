package pl.example.spring.Teczka;
import io.vavr.collection.List;

public class StudentService
{
    private List<Student> students = List.empty();

    List<Student> getStudents()
    {
        return this.students;
    }


    Student addStudent(final NewStudent newStudent)
    {
        Student created = new Student(students.size()+1,newStudent.name, newStudent.number, newStudent.stud_group);
        students = students.prepend(created);
        return created;
    }
}
