# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tiket (
  harga                     integer auto_increment not null,
  jumlah                    varchar(255),
  kotatujuan                varchar(255),
  id                        integer,
  constraint pk_tiket primary key (harga))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tiket;

SET FOREIGN_KEY_CHECKS=1;

