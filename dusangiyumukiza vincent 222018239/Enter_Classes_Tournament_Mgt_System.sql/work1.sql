-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2024 at 10:11 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: "work1"
--

-- --------------------------------------------------------

--
-- Table structure for table "adversaries"
--

CREATE TABLE "adversaries" ;

--
-- Dumping data for table "adversaries"
--

SET IDENTITY_INSERT "adversaries" ON ;
INSERT INTO "adversaries" ("ad_id", "name") VALUES
(1, 'RAYON SPORT'),
(2, 'APR FC');

SET IDENTITY_INSERT "adversaries" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "matches"
--

CREATE TABLE "matches" ;

--
-- Dumping data for table "matches"
--

SET IDENTITY_INSERT "matches" ON ;
INSERT INTO "matches" ("match_id", "date", "play_ground", "ref_id", "ad_id", "user_id") VALUES
(1, '2024-01-13', 'Stadium A', 1, 2, 3),
(2, '2024-01-15', 'Stadium B', 2, 1, 3);

SET IDENTITY_INSERT "matches" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "referees"
--

CREATE TABLE "referees" ;

--
-- Dumping data for table "referees"
--

SET IDENTITY_INSERT "referees" ON ;
INSERT INTO "referees" ("ref_id", "f_name", "l_name", "age", "sex", "telephone") VALUES
(1, 'NIYONSABA', 'Regine', '20', 'female', '0785556894'),
(2, 'HAKORIMANA', 'Gilbert', '12', 'male', '0785635803');

SET IDENTITY_INSERT "referees" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "tblresult"
--

CREATE TABLE "tblresult" ;

--
-- Dumping data for table "tblresult"
--

SET IDENTITY_INSERT "tblresult" ON ;
INSERT INTO "tblresult" ("id", "StudentId", "ClassId", "SubjectId", "marks", "PostingDate", "UpdationDate") VALUES
(1, 2, 101, 201, 85, '2024-01-12 22:00:00', '2024-01-12 22:00:00'),
(2, 1, 102, 202, 90, '2024-01-12 22:00:00', '2024-01-12 22:00:00');

SET IDENTITY_INSERT "tblresult" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "tblstudents"
--

CREATE TABLE "tblstudents" ;

--
-- Dumping data for table "tblstudents"
--

SET IDENTITY_INSERT "tblstudents" ON ;
INSERT INTO "tblstudents" ("StudentId", "StudentName", "RollId", "StudentEmail", "Gender", "DOB", "ClassId", "RegDate", "UpdationDate", "Status") VALUES
(1, 'John Doe', 'A123', 'john.doe@example.com', 'Male', '2000-01-01', 0, '2024-01-12 22:00:00', '2024-01-12 22:00:00', 0),
(2, 'Jane Smith', 'B456', 'jane.smith@example.com', 'Female', '1999-05-15', 0, '2024-01-12 22:00:00', '2024-01-12 22:00:00', 0);

SET IDENTITY_INSERT "tblstudents" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "users"
--

CREATE TABLE "users" ;

--
-- Dumping data for table "users"
--

SET IDENTITY_INSERT "users" ON ;
INSERT INTO "users" ("user_id", "u_name", "u_password") VALUES
(3, 'manager', '123');

SET IDENTITY_INSERT "users" OFF;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
