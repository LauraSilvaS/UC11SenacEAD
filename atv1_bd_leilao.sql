SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE uc11;
USE uc11;

CREATE TABLE produtos (
  id bigint(20) UNSIGNED NOT NULL,
  nome text DEFAULT NULL,
  valor int(11) DEFAULT NULL,
  status text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO produtos (id, nome, valor, status) VALUES
(2, 'PS4', 1500, 'Vendido'),
(3, 'Xbox 360', 800, 'Vendido'),
(4, 'Iphone 12', 4800, 'Vendido'),
(5, 'PS2', 400, 'A Venda');

ALTER TABLE produtos
  ADD PRIMARY KEY (id);

ALTER TABLE produtos
  MODIFY id bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;