package pl.example.spring.Teczka.db;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentRow
{
    public StudentRow(String name, String number, String stdgroup)
    { this.name = name;
        this.number = number;
        this.stud_group = stud_group;
    }
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id private long id;
    private String name;
    private String number;
    private String stud_group;



    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getStud_group()
{
    return stud_group;
}
    public void setGroup()
    {
        this.stud_group = stud_group;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public Long getId()
    {
    return id;
    }



}
