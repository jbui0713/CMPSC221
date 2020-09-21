/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Jefferson
 * Created: Mar 26, 2020
 */
CREATE TABLE Driver (
    driverID INT PRIMARY KEY,
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    dob DATE NOT NULL,
    age INT,
    driverRank INT NOT NULL,
    driftPoints INT NOT NULL,
    country VARCHAR(30) NOT NULL,
    team VARCHAR(50) NOT NULL,
    image BLOB NOT NULL
);