/*CREATE SEQUENCE City_seq;
CREATE SEQUENCE Superhero_seq;
CREATE SEQUENCE Team_seq;
CREATE SEQUENCE Alias_seq;
CREATE SEQUENCE Superpower_seq;
*/
CREATE TABLE City(
  id serial PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(5) NOT NULL
);

CREATE TABLE Superhero(
  id serial PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  height FLOAT,
  weight FLOAT,
  city_id INT
--   FOREIGN KEY city_id REFERENCES City(id)
);

CREATE TABLE Alias(
  id serial PRIMARY KEY,
  name VARCHAR(45) NOT NULL
);

CREATE TABLE SuperheroAlias(
  id serial PRIMARY KEY,
  superhero_id INT NOT NULL,
  alias_id INT NOT NULL
--   FOREIGN KEY superhero_id REFERENCES Superhero(id),
--   FOREIGN KEY alias REFERENCES Alias(id)
);

CREATE TABLE Superpower(
  id serial PRIMARY KEY,
  superpower VARCHAR(100) NOT NULL
);

CREATE TABLE SuperheroSuperpower(
  id serial PRIMARY KEY,
  superhero_id INT NOT NULL,
  superpower_id INT NOT NULL
--   FOREIGN KEY superhero_id REFERENCES Superhero(id),
--   FOREIGN KEY superpower_id REFERENCES Superpower(id)
);

CREATE TABLE Team(
  id serial PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(5) NOT NULL
);

CREATE TABLE SuperheroTeam(
  id serial PRIMARY KEY,
  superhero_id INT NOT NULL,
  team_id INT NOT NULL
--   FOREIGN KEY team_id REFERENCES Team(id),
--   FOREIGN KEY superhero_id REFERENCES Superhero(id)
);

