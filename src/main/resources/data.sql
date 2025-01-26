-- Reuniones
INSERT INTO reunion (asunto, fecha) VALUES ('Progreso personal', '2023-06-01');
INSERT INTO reunion (asunto, fecha) VALUES ('Seguimiento equipo', '2023-06-02');
INSERT INTO reunion (asunto, fecha) VALUES ('General', '2023-06-03');

-- Personas
INSERT INTO persona (nombre, apellidos) VALUES ('Juan', 'Gómez');
INSERT INTO persona (nombre, apellidos) VALUES ('Marisa', 'López');
INSERT INTO persona (nombre, apellidos) VALUES ('Ana', 'Pérez');
INSERT INTO persona (nombre, apellidos) VALUES ('Luz', 'García');
INSERT INTO persona (nombre, apellidos) VALUES ('Jose', 'Ruiz');

-- Finalmente creamos las relaciones en la tabla asistente
INSERT INTO asistente (reunion_id, persona_id) VALUES (1, 1);
INSERT INTO asistente (reunion_id, persona_id) VALUES (1, 2);
INSERT INTO asistente (reunion_id, persona_id) VALUES (2, 1);
INSERT INTO asistente (reunion_id, persona_id) VALUES (2, 3);
INSERT INTO asistente (reunion_id, persona_id) VALUES (2, 4);
INSERT INTO asistente (reunion_id, persona_id) VALUES (3, 1);
INSERT INTO asistente (reunion_id, persona_id) VALUES (3, 2);
INSERT INTO asistente (reunion_id, persona_id) VALUES (3, 3);
INSERT INTO asistente (reunion_id, persona_id) VALUES (3, 4);
INSERT INTO asistente (reunion_id, persona_id) VALUES (3, 5);
