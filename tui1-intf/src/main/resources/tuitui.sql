drop schema if exists tuitui;
create schema tuitui;
use tuitui;

create table tuitui_novel
(
    `id` int(11) not null auto_increment primary key,
    `author_id` int(11) not null,
    `status` tinyint(1) default 1 not null comment '0是删除',
    `type` int(11) comment '小说类型',
    `book_name` varchar(30),
    `author_name` varchar(30),
    `desc` text,
    `subscribe_num` int(11) default 0,
    `book_url` varchar(50) not null,
    `cover` varchar(100),
    `last_charpter_id` int(11),
    `last_update_time` datetime,
    `lastest_charpter` varchar(50),
    `charpter_url` varchar(50),
    `add_time` datetime,
    `update_time` datetime
) ENGINE = InnoDB;

