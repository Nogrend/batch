CREATE TABLE "jobs"
(
    id           BIGSERIAL PRIMARY KEY,
    name         varchar(255),
    createdAt    TIMESTAMP WITH TIME ZONE,
    retryCounter int default 0
);