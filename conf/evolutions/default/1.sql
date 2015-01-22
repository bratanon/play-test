# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table priority (
  id                        integer not null,
  name                      varchar(255),
  constraint pk_priority primary key (id))
;

create table tasks (
  id                        bigint not null,
  description               varchar(255),
  constraint pk_tasks primary key (id))
;

create sequence priority_seq;

create sequence tasks_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists priority;

drop table if exists tasks;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists priority_seq;

drop sequence if exists tasks_seq;

