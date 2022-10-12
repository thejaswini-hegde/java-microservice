CREATE TABLE citizen (id SERIAL PRIMARY KEY, name VARCHAR(50), vaccination_centerId VARCHAR(50));

INSERT INTO citizen (name, vaccination_centerId) VALUES ('Krishna', 'A_01');
INSERT INTO citizen (name, vaccination_centerId) VALUES ('Balaram', 'A_02');

SELECT * FROM citizen;

UPDATE citizen SET vaccination_centerId='A_01' WHERE id=2;

INSERT INTO citizen (name, vaccination_centerId) VALUES ('Nar', 'A_09');

SELECT * FROM citizen;

DELETE FROM citizen
WHERE id = 3;         

SELECT * FROM citizen;


