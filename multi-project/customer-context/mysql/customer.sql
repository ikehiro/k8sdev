CREATE TABLE customer (
  id               int(11) NOT NULL AUTO_INCREMENT,
  corporate_number varchar(12),
  name             varchar(128),
  json_val         json DEFAULT NULL,
  vc varchar(64) GENERATED ALWAYS AS (JSON_UNQUOTE(JSON_EXTRACT(json_val, '$.guid'))) VIRTUAL,
  PRIMARY KEY (id),
  KEY idx_vc (vc)
);