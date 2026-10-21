-- =============================================
-- Experiment 4: SQL Setup for JDBC Connection
-- =============================================

-- Step 1: Create Database
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

-- Step 2: Create Table
CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

-- Step 3: Insert Sample Records
INSERT INTO student (id, name) VALUES (101, 'Rahul');
INSERT INTO student (id, name) VALUES (102, 'Amit');
INSERT INTO student (id, name) VALUES (103, 'Sagar');

-- Step 4: Display Data
SELECT * FROM student;
