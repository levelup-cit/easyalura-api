create table cursos
(
    id               bigint       not null auto_increment,
    titulo           varchar(100) not null,
    descricao        varchar(500) not null,
    slug             varchar(50)  not null,
    carga_horaria    int          not null,
    data_criacao     date         not null,
    data_atualizacao date,
    primary key (id)
);
