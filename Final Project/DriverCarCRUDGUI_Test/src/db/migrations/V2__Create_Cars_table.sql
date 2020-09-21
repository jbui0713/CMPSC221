/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Jefferson
 * Created: Mar 26, 2020
 */
CREATE TABLE Car (
    carID INT PRIMARY KEY,
    make VARCHAR(30) NOT NULL,
    model VARCHAR(30) NOT NULL,
    color VARCHAR(30) NOT NULL,
    modelYear INT NOT NULL, 
    driverID INT NOT NULL,
    FOREIGN KEY (driverID) REFERENCES Driver (driverID)
);