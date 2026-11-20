
package kh.edu.istad.restfulapi.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
public class InstructorProfile {

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    private String biography;

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses = new ArrayList<>();
}
