CREATE TABLE user (
  id 		BIGINT(19) 	NOT NULL AUTO_INCREMENT,
  username 	VARCHAR(20) NOT NULL,
  password 	VARCHAR(6) 	NOT NULL,
  CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE TABLE role (
  id 		BIGINT(19) 	NOT NULL AUTO_INCREMENT,
  name 		VARCHAR(10) NOT NULL,
  CONSTRAINT pk_role PRIMARY KEY (id)
);

CREATE TABLE user_role (
  user_id 		BIGINT(19) 	NOT NULL,
  role_id 		BIGINT(19) 	NOT NULL,
  CONSTRAINT pk_user_role PRIMARY KEY (user_id, role_id),
  CONSTRAINT fk_ur_user_id FOREIGN KEY (user_id) REFERENCES user(id),
  CONSTRAINT fk_ur_role_id FOREIGN KEY (role_id) REFERENCES role(id)
);
