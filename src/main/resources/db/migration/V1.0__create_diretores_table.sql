create table if not exists diretores (

    id SERIAL,
    name varchar(500) not null,
    gender char(1) not null,

    constraint pk_diretores primary key(id)

);