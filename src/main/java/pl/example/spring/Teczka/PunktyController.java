package pl.example.spring.Teczka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyController
{
    private final StudentService studentService;

    public PunktyController(StudentService studentService)
    {
        this.studentService = studentService;
    }


    private CopyOnWriteArrayList<String> users= new CopyOnWriteArrayList<>();
    {
        this.users.addAll(Arrays.asList("Artur Osmanowski","Janusz Mikke","Andrzej Nowak","Karol Krawczyk","Tadeusz Norek"));
    }

    @RequestMapping( value = "/students", method = RequestMethod.GET)
    public List<Student> getUsers()
    {
        return studentService.getStudents().asJava();
    }


    @PostMapping( value ="/students/add",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addStudent(@RequestBody NewStudent student)
    {
        return studentService.addStudent(student);
    }


}
