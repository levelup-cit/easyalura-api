create table instrutores
(
    id           bigint       not null auto_increment,
    nome         varchar(100) not null,
    descricao    varchar(500) not null,
    linkedin_url varchar(100),
    primary key (id)
);