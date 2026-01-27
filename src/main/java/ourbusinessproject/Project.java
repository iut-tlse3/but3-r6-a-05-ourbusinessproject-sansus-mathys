package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;

public class Project {
    @NotBlank
    private String title;
    private String description;

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
}
