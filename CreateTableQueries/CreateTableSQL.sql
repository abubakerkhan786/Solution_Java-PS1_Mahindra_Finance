CREATE DATABASE Lead;

CREATE TABLE LeadsData (
	lead_id INTEGER NOT NULL,
	first_Name VARCHAR ( 50 ) NOT NULL,
	middle_Name VARCHAR ( 50 ),
	last_Name VARCHAR ( 255 ) NOT NULL,
	mobile_Number INTEGER NOT NULL,
	Gender VARCHAR ( 255 ) NOT NULL,
	DOB DATE NOT NULL
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
);
