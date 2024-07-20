package nogrend.batch.jobCreator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public class JobCreatorRepository {
    private final JdbcTemplate jdbcTemplate;

    public JobCreatorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveJob(JobCreator jobCreator) {
        String sql = """
                INSERT INTO jobs (name, createdat) VALUES (?, ?);
                """;

        jdbcTemplate.update(sql, ps -> {
            ps.setString(1, jobCreator.name());
            ps.setTimestamp(2, Timestamp.from(jobCreator.createdAt()));
        });
    }

    public void updateJob(JobUpdater jobUpdater){

    }
}
