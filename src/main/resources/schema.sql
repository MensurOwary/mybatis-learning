CREATE SEQUENCE City_seq;
CREATE SEQUENCE Superhero_seq;
CREATE SEQUENCE Team_seq;
CREATE SEQUENCE Alias_seq;
CREATE SEQUENCE Superpower_seq;

CREATE TABLE City(
  id INT DEFAULT City_seq.nextval PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(5) NOT NULL
);

CREATE TABLE Superhero(
  id INT DEFAULT Superhero_seq.nextval PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  height DOUBLE,
  weight DOUBLE,
  city_id INT,
--   FOREIGN KEY city_id REFERENCES City(id)
);

CREATE TABLE Alias(
  id INT DEFAULT Alias_seq.nextval PRIMARY KEY,
  name VARCHAR(45) NOT NULL
);

CREATE TABLE SuperheroAlias(
  id INT AUTO_INCREMENT PRIMARY KEY,
  superhero_id INT NOT NULL,
  alias_id INT NOT NULL,
--   FOREIGN KEY superhero_id REFERENCES Superhero(id),
--   FOREIGN KEY alias REFERENCES Alias(id)
);

CREATE TABLE Superpower(
  id INT DEFAULT Superpower_seq.nextval PRIMARY KEY,
  superpower VARCHAR(100) NOT NULL
);

CREATE TABLE SuperheroSuperpower(
  id INT AUTO_INCREMENT PRIMARY KEY,
  superhero_id VARCHAR(100) NOT NULL,
  superpower_id VARCHAR(100) NOT NULL,
--   FOREIGN KEY superhero_id REFERENCES Superhero(id),
--   FOREIGN KEY superpower_id REFERENCES Superpower(id)
);

CREATE TABLE Team(
  id INT DEFAULT Team_seq.nextval PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(5) NOT NULL
);

CREATE TABLE SuperheroTeam(
  id INT AUTO_INCREMENT PRIMARY KEY,
  superhero_id INT NOT NULL,
  team_id INT NOT NULL,
--   FOREIGN KEY team_id REFERENCES Team(id),
--   FOREIGN KEY superhero_id REFERENCES Superhero(id)
);



