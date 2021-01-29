DROP TABLE IF EXISTS calculation_history;

CREATE TABLE calculation_history (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_value DOUBLE NOT NULL,
  second_value DOUBLE NOT NULL,
  result DOUBLE NOT NULL,
  operation VARCHAR(10) NOT NULL
);

INSERT INTO calculation_history (first_value, second_value, result, operation) VALUES
  (3,2,5,'add'),
  (3,2,1,'subtract'),
  (3,2,6,'multiply'),
  (3,2,1.5,'divide');