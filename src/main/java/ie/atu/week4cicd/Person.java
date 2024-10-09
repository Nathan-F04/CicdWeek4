package ie.atu.week4cicd;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank(message="You must enter a name!")
    private String name;
    @NotBlank(message="You must enter a title!")
    private String title;
    @PositiveOrZero(message="You must enter a valid id!")
    private int employeeId;
    @Min(value=18, message="Your age should be 18 or older!")
    private int age;
    @Email(message="You must enter a valid email!")
    private String email;
    @NotBlank(message="You must enter a position!")
    private String position;
    @NotBlank(message="You must enter a department!")
    private String department;

}
