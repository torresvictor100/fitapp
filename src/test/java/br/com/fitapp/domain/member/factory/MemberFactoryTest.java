package br.com.fitapp.domain.member.factory;

import br.com.fitapp.domain.member.entity.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MemberFactoryTest {
    @Test
    public void member(){
        final var photoUrl = "photoUrl";
        final var discription = "discription";
        final var name = "name";

        final var member = MemberFactory.create(photoUrl, discription,name);

        Assertions.assertNotNull(member);
        Assertions.assertNotNull(member.getUuid());
        Assertions.assertEquals(member.getPhotoUrl(), photoUrl);
        Assertions.assertEquals(member.getDiscription(), discription);
        Assertions.assertEquals(member.getName(), name);
    }
}
