import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstSquareTest {

//   Tests if the first square is actually the first square.
    @Test
    public void first_square_test() {
        FirstSquare test_square = new FirstSquare();
        int test_number = test_square.get_square_number();

        assertEquals(1,test_number);
    }
}