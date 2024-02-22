import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserRegistrationTest {
    @Mock
    EmailService emailService;

    UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userRegistration = new UserRegistration(emailService);
    }

    @Test
    void shouldSendConfirmationEmailAfterUserRegistration() {
        userRegistration.registerUser("user@example.com");
        verify(emailService).sendConfirmationEmail("user@example.com");
    }
}