create table if not exists filmes(

    id SERIAL,
    name varchar(500) not null,
    gender VARCHAR(500) not null,
    yearr DATE,
    diretores_id integer not null,

    constraint pk_filmes primary key (id),
    constraint fk_filmes_diretores foreign key(diretores_id) references diretores(id)

);