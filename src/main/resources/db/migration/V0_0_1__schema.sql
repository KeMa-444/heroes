CREATE TABLE character
(
    id         BIGINT PRIMARY KEY,
    name       VARCHAR(255),
    real_name  VARCHAR(255),
    publisher  VARCHAR(255),
    alignment  VARCHAR(255),
    image_name VARCHAR(255),
    details_id BIGINT
);

CREATE TABLE character_details
(
    id                BIGINT PRIMARY KEY,
    intelligence      INT,
    strength          INT,
    speed             INT,
    durability        INT,
    power             INT,
    combat            INT,
    gender            VARCHAR,
    race              VARCHAR,
    eye_color         VARCHAR,
    hair_color        VARCHAR,
    height            VARCHAR,
    weight            VARCHAR,
    alter_egos        VARCHAR,
    place_of_birth    VARCHAR,
    first_appearance  VARCHAR,
    aliases           VARCHAR,
    occupation        VARCHAR,
    base              VARCHAR,
    group_affiliation VARCHAR,
    relatives         VARCHAR
);