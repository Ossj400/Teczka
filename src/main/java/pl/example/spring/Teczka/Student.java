package pl.example.spring.Teczka;

public class Student {
    final long id;
    final String name, stud_group, number;

    public Student(long id, String name, String number, String stud_group )
    {
        this.id = id;
        this.name = name;
        this.stud_group = stud_group;
        this.number = number;
    }

}
