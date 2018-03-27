package models.abstractModel;

import models.interfaces.IModel;

import javax.persistence.*;

@Entity
@Table
public  abstract  class Records implements IModel {

    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer Id;

    @Column(name = "pictureId")
    protected Integer pictureId;

    @Column(name = "videoId")
    protected Integer videoId;

    @Column(name = "title")
    protected String title;

    @Column(name = "description")
    protected String description;

    @Column(name = "likes")
    protected Integer likes;

    public Integer getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
                "Id=" + Id +
                ", pictureId=" + pictureId +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likes=" + likes +
                '}';
    }
}
