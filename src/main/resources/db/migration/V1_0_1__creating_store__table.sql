CREATE TABLE IF NOT EXISTS store_ (
    store_id SERIAL PRIMARY KEY,
    store_name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    manager_name VARCHAR(255),
    founded_date DATE,
    is_open BOOLEAN DEFAULT true
)
