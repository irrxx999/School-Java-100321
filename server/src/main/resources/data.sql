DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Cards;

CREATE TABLE Cards (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  pin INT NOT NULL
);

CREATE TABLE Accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  balance int DEFAULT 0,
  currency varchar2(255),
  card_id  INT NOT NULL,
    foreign key (card_id) references Cards(id)
);

INSERT INTO Cards (pin) VALUES
  (30),
  (35),
  (40);

INSERT INTO Accounts (balance,currency,card_id) VALUES
  (123,'USD',1),
  (654,'EUR',2),
  (967,'RUR',3);
