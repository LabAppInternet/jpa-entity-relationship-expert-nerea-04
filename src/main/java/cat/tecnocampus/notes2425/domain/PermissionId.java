package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PermissionId implements Serializable {
    private Long userId;
    private Long noteId;

    // Constructor, equals y hashCode
}
