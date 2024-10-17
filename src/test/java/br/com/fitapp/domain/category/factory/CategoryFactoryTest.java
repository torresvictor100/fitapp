package br.com.fitapp.domain.category.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class CategoryFactoryTest {

    @Test
    public void categoryFactory(){
        final var photoUrl = "photoUrl";
        final var discription = "discription";
        final var name = "name";
        final var category = CategoryFactory.create(photoUrl, discription, name);

        Assertions.assertNotNull(category);
        Assertions.assertNotNull(category.getUuid());
        Assertions.assertEquals(category.getPhotoUrl(), photoUrl);
        Assertions.assertEquals(category.getDiscription(), discription);
        Assertions.assertEquals(category.getName(), name);
    }
}
