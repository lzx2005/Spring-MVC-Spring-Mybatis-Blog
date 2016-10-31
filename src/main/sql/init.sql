CREATE DATABASE lzx2005;

use lzx2005;

CREATE TABLE user(
`user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
`username` VARCHAR(20) NOT NULL COMMENT '用户名',
`password` VARCHAR(120) NOT NULL COMMENT '密码',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`user_type` tinyint NOT NULL DEFAULT 1 COMMENT '用户类型，管理员0，普通用户1',
PRIMARY KEY(user_id),
UNIQUE(username)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE blog(
`blog_id` bigint NOT NULL AUTO_INCREMENT COMMENT '文章ID',
`title` VARCHAR(30) NOT NULL COMMENT '文章标题',
`author` VARCHAR(120) NOT NULL COMMENT '文章作者',
`description` VARCHAR(120) NOT NULL COMMENT '文章描述',
`content` text NOT NULL COMMENT '文章正文',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`view` bigint NOT NULL DEFAULT 0 COMMENT '浏览量',
`blog_type` tinyint NOT NULL DEFAULT 0 COMMENT '文章类型,普通0',
`markdown` tinyint NOT NULL DEFAULT 0 COMMENT '是否为Markdown,不是0，是1',
PRIMARY KEY(blog_id)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='博客列表';


CREATE TABLE image(
`image_id` bigint NOT NULL AUTO_INCREMENT COMMENT '图片ID',
`name` VARCHAR(30) NOT NULL COMMENT '图片名称',
`size` bigint NOT NULL COMMENT '图片大小kb',
`relative_path` VARCHAR(200) NOT NULL COMMENT '相对路径',
`absolute_path` VARCHAR(300) NOT NULL COMMENT '绝对路径',
`upload_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '上传时间',
PRIMARY KEY(image_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图片存储';