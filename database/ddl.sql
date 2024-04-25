CREATE TABLE users
(
    user_id       SERIAL PRIMARY KEY,
    username      TEXT NOT NULL,
    password_hash TEXT NOT NULL
);

CREATE TABLE posts
(
    post_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    content TEXT    NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);
