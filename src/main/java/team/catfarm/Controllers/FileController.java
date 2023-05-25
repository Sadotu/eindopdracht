package team.catfarm.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.catfarm.DTO.Input.FileInputDTO;
import team.catfarm.DTO.Output.FileOutputDTO;
import team.catfarm.Services.FileService;

import java.util.List;

@RestController
@RequestMapping("/files")
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) { this.fileService = fileService; }

    @PostMapping("/upload")
    public ResponseEntity<List<FileOutputDTO>> uploadFiles(@RequestBody List<FileInputDTO> file) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fileService.uploadFiles(file));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FileOutputDTO> getFileById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(fileService.getFileById(id));
    }

    @GetMapping("/path/{location}")
    public ResponseEntity<List<FileOutputDTO>> getFilesByLocation(@PathVariable String location) {
        return ResponseEntity.ok(fileService.getFilesByLocation(location));
    }

    @GetMapping("/events/{event_id}")
    public ResponseEntity<List<FileOutputDTO>> getFilesByEventId(@PathVariable("event_id") Long eventId) {
        return ResponseEntity.ok(fileService.getFilesByEventId(eventId));
    }

    @GetMapping("/users/{user_email}")
    public ResponseEntity<List<FileOutputDTO>> getFilesByUserId(@PathVariable("user_email") String userEmail) {
        return ResponseEntity.ok(fileService.getFilesByUserEmail(userEmail));
    }

    @GetMapping("/tasks/{task_id}")
    public ResponseEntity<List<FileOutputDTO>> getFilesByTaskId(@PathVariable("task_id") Long taskId) {
        return ResponseEntity.ok(fileService.getFilesByTaskId(taskId));
    }

//    @GetMapping("/search")
//    public ResponseEntity<List<File>> searchFiles(@RequestParam String term, @RequestParam String currentDirectory) {
//        List<File> searchResults = fileService.searchFiles(term, currentDirectory);
//        return ResponseEntity.ok(searchResults);
//    }

    @PutMapping("/updatefiles")
    public ResponseEntity<List<FileOutputDTO>> updateFiles(@RequestBody List<FileInputDTO> fileInputDTOList) {
        return ResponseEntity.ok(fileService.updateFilesById(fileInputDTOList));
    }

    @PutMapping("/{id}/task/{task_id}")
    public void assignTaskToFile(@PathVariable Long id, @PathVariable Long task_id) {
        fileService.assignTaskToFile(id, task_id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFileById(@PathVariable long id) {
        fileService.deleteFileById(id);
    }
}
