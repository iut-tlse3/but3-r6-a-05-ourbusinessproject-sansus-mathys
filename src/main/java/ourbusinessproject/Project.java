package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;
    private String description;

    @NotNull
    @ManyToOne
    private Enterprise enterprise;

    /**
     * set the description
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the project id
     */
    public Long getId() {
        return id;
    }

    /**
     * set the enterprise
     * @param enterprise the enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     *
     * @return the enterprise
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }
}
