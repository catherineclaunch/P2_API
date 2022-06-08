Welcome to the Beats Ahoy API

As a [user] I will be able to generate a playlist, add friends, view all playlists
As a [admin] I will be able to delete users, edit questions





create schema P2_BeatsAhoy;

create table Users (
username varchar(25) primary key, 
fname varchar(20) not null,
lname varchar(20) not NULL,
"password" varchar(20) not null
)

create table genres (
username varchar(25) not null,
genres varchar(25) not null
)

create table questions(
questions varchar(100) not null,
answers varchar(50) not null
)

create table user_playlists(
username varchar(20),
playlist varchar(50)
)

create table friend_list(
username varchar(20),
friend_username varchar(20)
)
