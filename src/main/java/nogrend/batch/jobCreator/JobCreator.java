package nogrend.batch.jobCreator;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.time.ZonedDateTime;

public record JobCreator(
        @NotNull @Size(min = 3, max = 100)
        String name,
        @NotNull
        Instant createdAt
) {
}
