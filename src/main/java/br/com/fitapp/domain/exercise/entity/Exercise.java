package br.com.fitapp.domain.exercise.entity;

import br.com.fitapp.domain.category.entity.Category;
import br.com.fitapp.domain.group.entity.Group;
import br.com.fitapp.domain.member.entity.Member;

import java.util.List;
import java.util.UUID;

public class Exercise {
    private String uuid;
    private String name;
    private String discription;
    private String mediaContent;
    private List<Group> groupList;
    private List<Category> categoryList;
    private List<Member> memberList;

    public Exercise(List<Member> memberList, List<Category> categoryList,
                    List<Group> groupList, String photoUrl, String name, String discription) {
        this.uuid = UUID.randomUUID().toString();
        this.memberList = memberList;
        this.categoryList = categoryList;
        this.groupList = groupList;
        this.mediaContent = photoUrl;
        this.name = name;
        this.discription = discription;

        this.validate();
    }

    private void validate(){
        if(this.uuid == null){
            throw new NullPointerException("Field uuid is null");
        }
        if(this.name == null){
            throw new NullPointerException("Field name is null");
        }
        if(this.groupList.isEmpty()){
            throw new NullPointerException("Field group is null");
        }
        if(this.categoryList.isEmpty()){
            throw new NullPointerException("Field category is null");
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

    public String getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(String mediaContent) {
        this.mediaContent = mediaContent;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
