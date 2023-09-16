DROP TABLE product IF EXISTS;
CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO product (title, cost) VALUES ('Хлеб', 50), ('Молоко', 70), ('Масло', 100);

