package models.main;

import models.abstractModel.Records;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project extends Records {

    @Column(name = "participant")
    private int participant;

    public int getParticipant() {
        return participant;
    }

    public void setParticipant(int participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Id=" + this.getId() +
                ", pictureId=" + this.getPictureId() +
                ", videoId=" + this.getVideoId() +
                ", title='" + this.getTitle() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", likes=" + this.getLikes() + '\'' +
                ", participant=" + this.participant  +
                '}';

    }
}
