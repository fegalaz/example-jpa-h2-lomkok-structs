DROP TABLE IF EXISTS autos;
CREATE TABLE autos (
  id int NOT NULL AUTO_INCREMENT,
  marca VARCHAR(250) NOT NULL,
  modelo VARCHAR(250) NOT NULL,
  color VARCHAR(250) NOT NULL,
  ruedas int DEFAULT NULL
);