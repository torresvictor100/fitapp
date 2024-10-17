package br.com.fitapp.domain.group.entity;

import java.util.UUID;

public class Group {
    private String uuid;
    private String name;
    private String discription;
    private String photoUrl;

    public Group(String photoUrl, String discription, String name) {
        this.uuid = UUID.randomUUID().toString();;
        this.photoUrl = photoUrl;
        this.discription = discription;
        this.name = name;

        this.validate();
    }

    private void validate(){
        if(this.uuid == null){
            throw new NullPointerException("Field uuid is null");
        }
        if(this.name == null){
            throw new NullPointerException("Field name is null");
        }
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
