package br.com.fitapp.domain.exercise.factory;

import br.com.fitapp.domain.category.entity.Category;
import br.com.fitapp.domain.category.factory.CategoryFactory;
import br.com.fitapp.domain.group.entity.Group;
import br.com.fitapp.domain.group.factory.GroupFactory;
import br.com.fitapp.domain.member.entity.Member;
import br.com.fitapp.domain.member.factory.MemberFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class ExerciseFactoryTest {

    @Test
    public void exercise(){
        final var photoUrlMember = "photoUrlMember";
        final var discriptionMember = "discriptionMember";
        final var nameMember = "nameMember";

        final var member = MemberFactory.create(photoUrlMember, discriptionMember, nameMember);
        final List<Member> memberList = new ArrayList<>();
        memberList.add(member);

        final var photoUrlGroup = "photoUrlGroup";
        final var discriptionGroup = "discriptionGroup";
        final var nameGroup = "nameGroup";

        final var group = GroupFactory.create(photoUrlGroup, discriptionGroup, nameGroup);
        final List<Group> groupList = new ArrayList<>();
        groupList.add(group);

        final var photoUrlCategory = "photoUrlCategory";
        final var discriptionCategory = "discriptionCategory";
        final var nameCategory = "nameCategory";

        final var category = CategoryFactory.create(photoUrlCategory, discriptionCategory, nameCategory);
        final List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);

        final var mediaContentExercise = "mediaContentExercise";
        final var discriptionExercise = "discriptionExercise";
        final var nameExercise = "nameExercise";

        final var exercise = ExerciseFactory.create(memberList, categoryList, groupList
                , mediaContentExercise, nameExercise,  discriptionExercise);

        Assertions.assertNotNull(exercise);
        Assertions.assertNotNull(exercise.getUuid());
        Assertions.assertEquals(exercise.getMediaContent(), mediaContentExercise);
        Assertions.assertEquals(exercise.getName(), nameExercise);
        Assertions.assertEquals(exercise.getDiscription(), discriptionExercise);
        Assertions.assertEquals(exercise.getMemberList(), memberList);
        Assertions.assertEquals(exercise.getCategoryList(), categoryList);
        Assertions.assertEquals(exercise.getGroupList(), groupList);
    }
}
