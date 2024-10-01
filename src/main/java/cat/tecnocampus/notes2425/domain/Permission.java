package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "permission")
public class Permission {

    @EmbeddedId
    private PermissionId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private UserLab user;

    @ManyToOne
    @MapsId("noteId")
    @JoinColumn(name = "note_id")
    private Note note;

    private boolean canRead;
    private boolean canEdit;

    // Constructor, getters y setters
}
