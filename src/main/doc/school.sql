DROP TABLE if exists `homework`;
CREATE TABLE `homework`
(
    `id`          BIGINT AUTO_INCREMENT,
    `title`       VARCHAR(20) NULL,
    `content`     TEXT        NULL,
    `create_time` TIMESTAMP   NOT NULL,
    `update_time` TIMESTAMP   NOT NULL,
    PRIMARY KEY (`id`)
);


DROP TABLE if exists `student`;
CREATE TABLE `student`
(
    `id`   BIGINT auto_increment,
    `name` VARCHAR(20) NOT NULL,

    PRIMARY KEY (`id`)
);

DROP TABLE if exists `teacher`;
CREATE TABLE `teacher`
(
    `id`   BIGINT auto_increment,
    `name` VARCHAR(20) NOT NULL,

    PRIMARY KEY (`id`)
);


DROP TABLE if exists `homework`;
CREATE TABLE `homework`
(
    `id`               BIGINT      AUTO_INCREMENT,
    `student_id`       BIGINT      NOT NULL,
    `homework_id`      BIGINT      NOT NULL,
    `homework_title`   VARCHAR(45) NOT NULL,
    `homework_content` TEXT        NULL,
    `create_time`      TIMESTAMP   NOT NULL,
    `update_time`      TIMESTAMP   NULL,
    PRIMARY KEY (`id`)
);


