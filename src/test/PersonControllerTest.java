import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.service.PersonService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PersonControllerTest {

    @Autowired
    PersonService personService;




}