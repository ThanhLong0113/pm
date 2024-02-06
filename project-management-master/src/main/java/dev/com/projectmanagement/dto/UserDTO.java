package dev.com.projectmanagement.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class UserDTO {
    @Id
    private String userId;
    private String username;
    private String fullName;
    private String jobPosition;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;
    private String address;

}
