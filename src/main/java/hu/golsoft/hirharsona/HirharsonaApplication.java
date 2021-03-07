package hu.golsoft.hirharsona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HirharsonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HirharsonaApplication.class, args);
	}

	/*
	CREATE database IF NOT EXISTS hirmondo;
	USE hirmondo;
	CREATE TABLE art (id BIGINT AUTO_INCREMENT PRIMARY KEY, auth_id BIGINT, subj VARCHAR(50) NOT NULL, descr VARCHAR(100), artic TEXT NOT NULL, last DATETIME, del TINYINT, star FLOAT);
	CREATE TABLE auth (id BIGINT AUTO_INCREMENT PRIMARY KEY, a_name VARCHAR(50) NOT NULL, addr VARCHAR(100), email VARCHAR(100) NOT NULL, phone VARCHAR(20));
	CREATE TABLE eval (id BIGINT AUTO_INCREMENT PRIMARY KEY, art_id BIGINT, pers_id BIGINT, star TINYINT);
	CREATE TABLE pers (id BIGINT AUTO_INCREMENT PRIMARY KEY, nick VARCHAR(50) NOT NULL, p_email VARCHAR(100) NOT NULL);
	CREATE TABLE comm (id BIGINT AUTO_INCREMENT PRIMARY KEY, pers_id BIGINT, p_comm TEXT NOT NULL);
	CREATE TABLE logg (id BIGINT AUTO_INCREMENT PRIMARY KEY, typ_id BIGINT, cir TINYINT, iden BIGINT, obj_id BIGINT, timdat DATETIME);
	CREATE TABLE typ (id INT, logtype VARCHAR(10));

	INSERT INTO typ (id, logtype) VALUES ('1','make');
	INSERT INTO typ (id, logtype) VALUES ('2','modify');
	INSERT INTO typ (id, logtype) VALUES ('3','delete');
	INSERT INTO typ (id, logtype) VALUES ('4','star');
	INSERT INTO typ (id, logtype) VALUES ('5','comment');
	 */
}
