package models.main;

import models.abstractModel.Records;

public class Project extends Records {

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
