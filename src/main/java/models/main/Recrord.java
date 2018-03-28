package models.main;


import models.abstractModel.Records;
import javax.persistence.*;

//19.03.2018 Пустое потому-что на данный момент полностью соотвестует асбтрактному классу Records

@Entity
@Table(name = "record")
public class Recrord{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name = "title")
    protected String title;

    @Column(name = "description")
    protected String description;

    @Column(name = "likes")
    protected Integer likes;

    @Column(name = "pictureId")
    protected Integer pictureId;

    @Column(name = "videoId")
    protected Integer videoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Records{" +
                "id=" + id +
                ", pictureId=" + pictureId +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likes=" + likes +
                '}';
    }



}
