package br.com.fitapp.domain.group;

import br.com.fitapp.domain.group.entity.Group;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class GroupTest {

    @Test
    public void group(){
        final var photoUrl = "photoUrl";
        final var discription = "discription";
        final var name = "name";

        final var group = new Group(photoUrl, discription,name);

        Assertions.assertNotNull(group);
        Assertions.assertNotNull(group.getUuid());
        Assertions.assertEquals(group.getPhotoUrl(), photoUrl);
        Assertions.assertEquals(group.getDiscription(), discription);
        Assertions.assertEquals(group.getName(), name);

    }

    @Test
    public void groupExecption(){

        final var photoUrl = "photoUrl";
        final var discription = "discription";

        Assertions.assertThrows(NullPointerException.class,() -> {
            new Group(photoUrl, discription,null);
        });
    }
}
