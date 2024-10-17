package br.com.fitapp.domain.exercise.factory;

import br.com.fitapp.domain.category.entity.Category;
import br.com.fitapp.domain.exercise.entity.Exercise;
import br.com.fitapp.domain.group.entity.Group;
import br.com.fitapp.domain.member.entity.Member;

import java.util.List;

public class ExerciseFactory {
    public static Exercise create( List<Member> memberList, List<Category> categoryList, List<Group> groupList,
                                   String photoUrl, String name, String discription){
        return new Exercise(memberList, categoryList, groupList, photoUrl, name, discription);
    }
}
