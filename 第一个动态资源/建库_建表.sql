
create database hjb2_0705 charset utf8mb4;
use hjb2_0705;
create table dictionary(
english varchar(100) not null unique,
chinese varchar(100) not null
);
insert into dictionary values
('apple','苹果'),
('pear','梨子'),
('pig','猪'),
('dog','小狗'),
('beef','牛肉'),
('duck','鸭子');