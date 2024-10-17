package br.com.fitapp.domain.category.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class CategoryTest {

    @Test
    public void category(){
        final var photoUrl = "photoUrl";
        final var discription = "discription";
        final var name = "name";

        final var category = new Category(photoUrl, discription,name);

        Assertions.assertNotNull(category);
        Assertions.assertNotNull(category.getUuid());
        Assertions.assertEquals(category.getPhotoUrl(), photoUrl);
        Assertions.assertEquals(category.getDiscription(), discription);
        Assertions.assertEquals(category.getName(), name);

    }

    @Test
    public void categoryExecption(){

        final var photoUrl = "photoUrl";
        final var discription = "discription";

        Assertions.assertThrows(NullPointerException.class,() -> {
            new Category(photoUrl, discription,null);
        });
    }
}
