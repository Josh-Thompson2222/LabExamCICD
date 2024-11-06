package ie.atu.labexam;



import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Employee {

   @Pattern(regexp = "EMP-XXX", message = "Incorrect Unique Employee code format. Please try again")
    private String employeeCode;

   @Max(value = 100, message = "Must be less than 100 characters")
    private String name;

   @Email(message = "not valid email format")
    private String email;

   @NotBlank(message = "Must enter 'Manager', 'Developer' or 'Analyst' ")
    private String position;

   @Positive(message = "Must be positive")
    private Double salary;
   /*
   @DateTimeFormat(value = (DD/MM/YYYY), message = "Must be today or earlier")
    private int dateOfJoining;
   */
}
