package team.catfarm.Controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.catfarm.DTO.Input.TaskInputDTO;
import team.catfarm.DTO.Output.TaskOutputDTO;
import team.catfarm.Services.TaskService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/add")
    public ResponseEntity<TaskOutputDTO> addTask(@RequestBody TaskInputDTO taskInputDTO) throws URISyntaxException {
        TaskOutputDTO savedTask = taskService.addTask(taskInputDTO);
        return ResponseEntity.created(new URI("/tasks/" + savedTask.getId())).body(savedTask);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskOutputDTO> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping("/user_tasks/{user_email}")
    public ResponseEntity<List<TaskOutputDTO>> getTasksByUser(@PathVariable String user_email) {
        return ResponseEntity.ok(taskService.getTasksByUser(user_email));
    }

//    @GetMapping("/{filter}")
//    public ResponseEntity<List<TaskOutputDTO>> getTasksByFilter(@PathVariable String filter) {
//        return ResponseEntity.ok(taskService.getTasksByFilter(filter));
//    }

    // create get for tasks of individual users
    // create get for tasks of individual labels
    // create get for completed tasks
    // the backend only does the first filter, multiple filters are handled by the frontend

    @PutMapping("/update/{id}")
    public ResponseEntity<TaskOutputDTO> updateTask(@PathVariable Long id, @Valid @RequestBody TaskInputDTO taskInputDTO) {
        TaskOutputDTO updatedTask = taskService.updateTaskById(id, taskInputDTO);
        return ResponseEntity.ok(updatedTask);
    }

    @PutMapping("/{id}/event/{event_id}")
    public ResponseEntity<Long> assignEventToTask(@PathVariable Long id, @PathVariable Long event_id) {
        return ResponseEntity.ok(taskService.assignEventToTask(id, event_id));
    }

    @PutMapping("/{id}/files/")
    public ResponseEntity<TaskOutputDTO> assignFilesToTask(@PathVariable Long id, @RequestBody List<Long> task_id) {
        return ResponseEntity.ok(taskService.assignFilesToTask(id, task_id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return ResponseEntity.noContent().build();
    }
}
