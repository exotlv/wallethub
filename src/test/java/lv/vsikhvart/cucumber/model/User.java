package lv.vsikhvart.cucumber.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    String firstName;
    String lastName;
    String email;
}
