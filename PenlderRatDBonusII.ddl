CREATE TABLE Administrator (Email varchar(255) NOT NULL, Password varchar(255), PRIMARY KEY (Email)) ENGINE=InnoDB;
CREATE TABLE DrittUnternehmen (Email varchar(255) NOT NULL, AnzahlBoni int(10) NOT NULL, AusgezahltPunkte bigint(20) NOT NULL, UnternehmenName varchar(255), Password varchar(255), PRIMARY KEY (Email)) ENGINE=InnoDB;
CREATE TABLE Bonus (Name varchar(255) NOT NULL, ArbeitgeberEmail varchar(255) NOT NULL, GesammeltePunkte int(10) NOT NULL, EingelöstePunkte int(10) NOT NULL, BelohnungVerfügbar tinyint(1) NOT NULL, PRIMARY KEY (Name)) ENGINE=InnoDB;
CREATE TABLE Meilenstein (Name varchar(255) NOT NULL, Meilenstein int(10) NOT NULL, PRIMARY KEY (Name)) ENGINE=InnoDB;
CREATE TABLE Pendler (Email varchar(255) NOT NULL, ArbeitgeberEmail varchar(255), Password varchar(255), Name varchar(255), Vorname varchar(255), Id int(10) NOT NULL, PRIMARY KEY (Email)) ENGINE=InnoDB;
CREATE TABLE Arbeitgeber (Email varchar(255) NOT NULL, AnzahlBoni int(10) NOT NULL, AusgezahltPunkte bigint(20) NOT NULL, UnternehmenName varchar(255), Password varchar(255), PRIMARY KEY (Email)) ENGINE=InnoDB;
CREATE TABLE Administrator_Bonus (AdministratorEmail varchar(255) NOT NULL, BonusName varchar(255) NOT NULL, PRIMARY KEY (AdministratorEmail, BonusName)) ENGINE=InnoDB;
CREATE TABLE Administrator_Pendler (AdministratorEmail varchar(255) NOT NULL, PendlerEmail varchar(255) NOT NULL, PRIMARY KEY (AdministratorEmail, PendlerEmail)) ENGINE=InnoDB;
CREATE TABLE Pendler_Bonus (PendlerEmail varchar(255) NOT NULL, BonusName varchar(255) NOT NULL, PRIMARY KEY (PendlerEmail, BonusName)) ENGINE=InnoDB;
CREATE TABLE Pendler_Meilenstein (PendlerEmail varchar(255) NOT NULL, MeilensteinName varchar(255) NOT NULL, PRIMARY KEY (PendlerEmail, MeilensteinName)) ENGINE=InnoDB;
CREATE TABLE Administrator_DrittUnternehmen (AdministratorEmail varchar(255) NOT NULL, DrittUnternehmenEmail varchar(255) NOT NULL, PRIMARY KEY (AdministratorEmail, DrittUnternehmenEmail)) ENGINE=InnoDB;
CREATE TABLE Administrator_Meilenstein (AdministratorEmail varchar(255) NOT NULL, MeilensteinName varchar(255) NOT NULL, PRIMARY KEY (AdministratorEmail, MeilensteinName)) ENGINE=InnoDB;
CREATE TABLE Administrator_Arbeitgeber (AdministratorEmail varchar(255) NOT NULL, ArbeitgeberEmail varchar(255) NOT NULL, PRIMARY KEY (AdministratorEmail, ArbeitgeberEmail)) ENGINE=InnoDB;
ALTER TABLE Administrator_Bonus ADD CONSTRAINT begutachtet FOREIGN KEY (AdministratorEmail) REFERENCES Administrator (Email);
ALTER TABLE Administrator_Bonus ADD CONSTRAINT begutachtet2 FOREIGN KEY (BonusName) REFERENCES Bonus (Name);
ALTER TABLE Administrator_Pendler ADD CONSTRAINT verwaltet FOREIGN KEY (AdministratorEmail) REFERENCES Administrator (Email);
ALTER TABLE Administrator_Pendler ADD CONSTRAINT verwaltet2 FOREIGN KEY (PendlerEmail) REFERENCES Pendler (Email);
ALTER TABLE Pendler ADD CONSTRAINT `angestellt bei` FOREIGN KEY (ArbeitgeberEmail) REFERENCES Arbeitgeber (Email);
ALTER TABLE Pendler_Bonus ADD CONSTRAINT beanprucht FOREIGN KEY (PendlerEmail) REFERENCES Pendler (Email);
ALTER TABLE Pendler_Bonus ADD CONSTRAINT beanprucht2 FOREIGN KEY (BonusName) REFERENCES Bonus (Name);
ALTER TABLE Pendler_Meilenstein ADD CONSTRAINT erreicht FOREIGN KEY (PendlerEmail) REFERENCES Pendler (Email);
ALTER TABLE Pendler_Meilenstein ADD CONSTRAINT erreicht2 FOREIGN KEY (MeilensteinName) REFERENCES Meilenstein (Name);
ALTER TABLE Administrator_DrittUnternehmen ADD CONSTRAINT registriert FOREIGN KEY (AdministratorEmail) REFERENCES Administrator (Email);
ALTER TABLE Administrator_DrittUnternehmen ADD CONSTRAINT registriert2 FOREIGN KEY (DrittUnternehmenEmail) REFERENCES DrittUnternehmen (Email);
ALTER TABLE Administrator_Meilenstein ADD CONSTRAINT konfiguriert FOREIGN KEY (AdministratorEmail) REFERENCES Administrator (Email);
ALTER TABLE Administrator_Meilenstein ADD CONSTRAINT konfiguriert2 FOREIGN KEY (MeilensteinName) REFERENCES Meilenstein (Name);
ALTER TABLE Bonus ADD CONSTRAINT konfiguriert3 FOREIGN KEY (ArbeitgeberEmail) REFERENCES Arbeitgeber (Email);
ALTER TABLE Administrator_Arbeitgeber ADD CONSTRAINT berät FOREIGN KEY (AdministratorEmail) REFERENCES Administrator (Email);
ALTER TABLE Administrator_Arbeitgeber ADD CONSTRAINT berät2 FOREIGN KEY (ArbeitgeberEmail) REFERENCES Arbeitgeber (Email);