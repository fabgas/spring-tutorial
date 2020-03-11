CREATE SEQUENCE instructor_id_seq;
CREATE TABLE instructor (
  id integer NOT NULL DEFAULT  nextval('instructor_id_seq'),
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  instructor_detail_id int(11) DEFAULT NULL, 
   PRIMARY KEY ("id")
   KEY FK_DETAIL_idx (`instructor_detail_id`),
  CONSTRAINT `FK_DETAIL` FOREIGN KEY (`instructor_detail_id`) REFERENCES `instructor_detail` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  
) 

ALTER SEQUENCE instructor_id_seq
OWNED BY instructor.id;

CREATE SEQUENCE instructor_detail_id_seq;
CREATE TABLE instructor_detail (
  id integer NOT NULL DEFAULT  nextval('student_id_seq'),
  youtube_channel varchar(128) DEFAULT NULL,
  hobby varchar(45) DEFAULT NULL,
  PRIMARY KEY ("id")
  
) 

ALTER SEQUENCE instructor_id_seq
OWNED BY instructor.id;