package br.com.fitapp.domain.group.factory;

import br.com.fitapp.domain.group.entity.Group;

public class GroupFactory {
    public static Group create( String photoUrl, String discription, String name){
        return new Group(photoUrl, discription, name);
    }
}
