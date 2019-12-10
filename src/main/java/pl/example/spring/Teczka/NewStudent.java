package pl.example.spring.Teczka;

import com.fasterxml.jackson.annotation.JsonProperty;
import pl.example.spring.Teczka.db.StudentRow;

import java.util.Set;

public class NewStudent
{
    @JsonProperty("name")  final String name;
    @JsonProperty("stud_group") final String stud_group;
    @JsonProperty("number") final String number;

    public NewStudent(long id, String name, String stud_group, String number)
    {
        this.name = name;
        this.stud_group = stud_group;
        this.number = number;
    }

}
