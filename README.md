## Description
BeatsAhoy allows its users to create an account and login to create a specialized playlist based off the following attributes. (Current Mood, Time of Day, Energy Level, Spontaneous level). These attributes are placed on a scale from 1 being the lowest and 10 being the highest. The following attributes are asked in a quiz like format. The results are then saved on the users profile along with a link to the playlist generated on the Spotify platform. The users can see all of the recently created playlists as well as their created playlists on the dashboard page.


## User Stories

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

## High-Level Requirements

Application must leverage the full stack:

-   Azure SQL for persistence
-   API built with Java 8 and Spring 5
-   UI built with React

### Technology framework requirements:

-   Java API will leverage the Spring Framework
-   Java API will use Spring Data JPA to communicate with the DB
-   Java API will be RESTful
-   Java API will be unit tested using JUnit and Mockito, with coverage reports generated using Jacoco
-   Complete CI/CD pipelines will use Azure DevOps

### Other requirements:

-   Application will demonstrate at least ten individual user stories
-   Application's own data model must be sufficiently complex (i.e. >2 tables)
-   SQL DB will be deployed to the cloud
-   Java API will be deployed to the cloud (Azure DevOps)
-   UI application will be deployed to the cloud (Azure Static Website on Azure Storage)
-   Java API will have >=80% test (line) coverage for service layer with validations (Used EclEmma or JaCoCo plugin to generate these reports)
-   Java API will leverage Spring's MockMvc for integration/e2e tests of controller endpoints
-   Java API will be adequately documented (Java Docs and web endpoint documentation [Swagger/OpenAPI])
-   At least one external API must be leveraged
