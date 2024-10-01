package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserLab owner;

    private String title;
    private String content;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @ManyToMany
    @JoinTable(
            name = "note_tag",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_name")
    )
    private Set<Tag> tags;

    public Set<Tag> tags() {
        return this.tags;
    }


    // Constructor vacío requerido por JPA
    public Note() {}

    // Constructor completo
    public Note(Long id, UserLab owner, String title, String content, LocalDateTime creationDate, Set<Tag> tags) {
        this.id = id;
        this.owner = owner;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.tags = tags;
    }
}