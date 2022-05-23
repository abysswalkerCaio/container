INSERT INTO tb_container(category, name_client, name_container, status, type) VALUES ('Importação', 'Caio', 'TEST1234567', 'Cheio', '20');
INSERT INTO tb_container(category, name_client, name_container, status, type) VALUES ('Exportação', 'A2', 'TEST8901234', 'Vazio', '40');

INSERT INTO tb_move(final_date, final_hour, movimentation, start_date, start_hour, container_id) VALUES ('25/05/2022', '20:00', 'Embarque', '23/05/2022', '14:00', 1);
INSERT INTO tb_move(final_date, final_hour, movimentation, start_date, start_hour, container_id) VALUES ('28/06/2022', '21:00', 'Descarga', '21/05/2022', '13:00', 2);

INSERT INTO tb_report(container_id, move_id) VALUES (1, 1);
INSERT INTO tb_report(container_id, move_id) VALUES (2, 2);