package nogrend.batch.jobCreator;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create")
public class JobCreatorController {

    private final JobCreatorService jobCreatorService;

    public JobCreatorController(JobCreatorService jobCreatorService) {
        this.jobCreatorService = jobCreatorService;
    }

    @PostMapping("/job")
    public void createJob(@Valid @RequestBody JobCreator jobCreator) {
        System.out.println("received request to create job");
        jobCreatorService.createJob(jobCreator);
    }
}
