package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "User_lab")
public class UserLab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Note> notes;

    // Constructor, getters y setters
}
