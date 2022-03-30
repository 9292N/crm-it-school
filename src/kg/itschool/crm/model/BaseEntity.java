package kg.itschool.crm.model;

import java.time.LocalDateTime;

abstract class BaseEntity {

    protected long id;
    protected LocalDateTime dateCreated;

    protected BaseEntity(Long id) {
        this.id = id;
        dateCreated = LocalDateTime.now();
    }

    protected BaseEntity() {
        dateCreated = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
