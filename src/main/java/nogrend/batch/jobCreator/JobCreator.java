package nogrend.batch.jobCreator;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.ZonedDateTime;

public record CreateJob(
        @NotNull @Size(min = 3, max = 100) String name,
        @NotNull ZonedDateTime createdAt
) {
}
