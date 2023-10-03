CREATE TABLE user (
    id VARCHAR(40) PRIMARY KEY NOT NULL,
    firstName VARCHAR(255) NOT NULL ,
    secondName VARCHAR(255) NOT NULL ,
    birthday DATE NOT NULL ,
    orderId VARCHAR(255) NOT NULL ,
    photoId VARCHAR(255) NOT NULL ,
    createdAt TIMESTAMP NOT NULL ,
)
