package team.catfarm.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.catfarm.DTO.Input.UserInputDTO;
import team.catfarm.DTO.Output.UserOutputDTO;
import team.catfarm.Exceptions.UserAlreadyExistsException;
import team.catfarm.Services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserOutputDTO> createUser(@RequestBody UserInputDTO userInputDTO) throws UserAlreadyExistsException {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userInputDTO));
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserOutputDTO> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @GetMapping("/active")
    public List<UserOutputDTO> getActiveUsers() {
        return userService.getActiveUsers();
    }

    @PutMapping("/update/{email}")
    public ResponseEntity<UserOutputDTO> updateUser(@PathVariable String email, @RequestBody UserInputDTO userToUpdateInputDTO) {
        return ResponseEntity.ok(userService.updateUser(email, userToUpdateInputDTO));
    }

    @PutMapping("/{email}/task/{task_id}")
    public ResponseEntity<Long> assignTaskToUser(@PathVariable String email, @PathVariable Long task_id) {
        return ResponseEntity.ok(userService.assignTaskToUser(email, task_id));
    }

    @PutMapping("/{email}/rsvp/{event_id}")
    public ResponseEntity<UserOutputDTO> assignEventToUser(@PathVariable String email, @PathVariable Long event_id) {
        return ResponseEntity.ok(userService.assignEventToUser(email, event_id));
    }

    @DeleteMapping("/{email}")
    public void deleteUser(@PathVariable String email) {
        userService.deleteUser(email);
    }
}
