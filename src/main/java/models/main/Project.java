package models.main;

import models.abstractModel.Records;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "pictureId")
    private Integer pictureId;

    @Column(name = "videoId")
    private Integer videoId;

    @Column(name = "users")
    private Integer users;


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likes=" + likes +
                ", pictureId=" + pictureId +
                ", videoId=" + videoId +
                ", users=" + users +
                '}';
    }
}
