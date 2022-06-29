create table cursos_instrutores
(
    cursos_id      bigint not null,
    instrutores_id bigint not null
);

alter table cursos_instrutores
    add constraint cursos_instrutores_instrutores
        foreign key (instrutores_id)
            references instrutores (id);

alter table cursos_instrutores
    add constraint cursos_instrutores_cursos
        foreign key (cursos_id)
            references cursos (id);
