CREATE TABLE IF NOT EXISTS user_ (
    id VARCHAR(40) PRIMARY KEY NOT NULL,
    first_name VARCHAR(255) NOT NULL ,
    second_name VARCHAR(255) NOT NULL ,
    birthday DATE NOT NULL ,
    order_id VARCHAR(255) ,
    photo_id VARCHAR(255) ,
    created_at TIMESTAMP NOT NULL
)
