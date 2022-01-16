import education.Lesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Lesson[] lessons;
}
