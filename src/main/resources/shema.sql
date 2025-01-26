DROP TABLE IF EXISTS asistente;
DROP TABLE IF EXISTS reunion;
DROP TABLE IF EXISTS persona;

CREATE TABLE IF NOT EXISTS reunion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    asunto VARCHAR(255),
    fecha DATE
);

CREATE TABLE persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255)
);

CREATE TABLE asistente (
    reunion_id BIGINT,
    persona_id BIGINT,
    PRIMARY KEY (reunion_id, persona_id),
    FOREIGN KEY (reunion_id) REFERENCES reunion(id),
    FOREIGN KEY (persona_id) REFERENCES persona(id)
);
