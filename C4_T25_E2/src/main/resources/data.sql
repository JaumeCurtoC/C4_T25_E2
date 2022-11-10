DROP TABLE IF EXISTS departamentos;

create table departamentos(
	id int auto_increment,
    nombre varchar(100),
    presupuesto int,
    primary key (id)
);

insert into departamentos (nombre, presupuesto)
values ('Departamento1', 10000);
insert into departamentos (nombre, presupuesto)
values ('Departamento2', 10500);
insert into departamentos (nombre, presupuesto)
values ('Departamento3', 20000);

drop table if exists empleados;

create table empleados(
	id int auto_increment,
    nombre varchar(100),
    apellidos varchar(100),
    departamento int,
    primary key (id),
    FOREIGN KEY (departamento) REFERENCES departamentos (id) 
	ON DELETE CASCADE ON UPDATE CASCADE
);

insert into empleados (nombre, apellidos, departamento)
values ('Empleado1', 'A sueldo', 1);
insert into empleados (nombre, apellidos, departamento)
values ('Empleado2', 'Temporal', 2);
insert into empleados (nombre, apellidos, departamento)
values ('Empleado3', 'Fijo', 3);