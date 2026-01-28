package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Collection;

@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String Name;

    @Size(min = 10)
    private String Description;

    @NotBlank
    private String ContactName;

    @NotBlank
    @Email
    private String ContactEmail;

    /**
     * set the contact email
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    /**
     * set the contact name
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    /**
     * set the description
     * @param description the description
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * set the name
     * @param name the name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the enterprise id
     */
    public Long getId() {
        return id;
    }
}
