package br.com.fitapp.domain.group.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class GroupFactoryTest {

    @Test
    public void group(){
        final var photoUrl = "photoUrl";
        final var discription = "discription";
        final var name = "name";

        final var group = GroupFactory.create(photoUrl, discription,name);

        Assertions.assertNotNull(group);
        Assertions.assertNotNull(group.getUuid());
        Assertions.assertEquals(group.getPhotoUrl(), photoUrl);
        Assertions.assertEquals(group.getDiscription(), discription);
        Assertions.assertEquals(group.getName(), name);
    }
}
