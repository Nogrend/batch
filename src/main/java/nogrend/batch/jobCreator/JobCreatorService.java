package nogrend.batch.jobCreator;

import org.springframework.stereotype.Service;

@Service
public class JobCreatorService {

    JobCreatorRepository jobCreatorRepository;

    public JobCreatorService(JobCreatorRepository jobCreatorRepository) {
        this.jobCreatorRepository = jobCreatorRepository;
    }

    public void createJob(JobCreator jobCreator) {
        System.out.println("service layer to business logic for creating job");
        jobCreatorRepository.saveJob(jobCreator);
    }
}
