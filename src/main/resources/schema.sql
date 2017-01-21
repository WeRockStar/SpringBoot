CREATE TABLE stock(
  stock_id INT,
  company_name VARCHAR2(50),
  sysbol VARCHAR2(10),
  price DECIMAL(10,2)
);

INSERT INTO stock VALUES (1, 'MacBook Pro', 'Apple', 199.00);
INSERT INTO stock VALUES (2, 'Surface Pro', 'Microsoft', 199.00);
INSERT INTO stock VALUES (3, 'DELL 32', 'DELL', 199.00);