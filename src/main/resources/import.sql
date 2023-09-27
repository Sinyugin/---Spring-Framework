-- DROP TABLE product IF EXISTS;
CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO product (title, cost) VALUES ('Хлеб', 50), ('Молоко', 70), ('Масло', 100);

-- DROP TABLE buyer IF EXISTS;
CREATE TABLE IF NOT EXISTS buyer (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO buyer (name) VALUES ('Мишаил'), ('Иван'), ('Елена'), ('Василий');

-- DROP TABLE orders IF EXISTS;
CREATE TABLE IF NOT EXISTS orders (product_id bigserial, buyer_id bigserial, FOREIGN KEY (product_id) REFERENCES product(id), FOREIGN KEY (buyer_id) FOREIGN KEY buyer (id));
INSERT INTO orders (product_id, buyer_id) VALUES (1,1), (1,2), (1,3), (2,1),(3,1);