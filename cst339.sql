-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Sep 08, 2024 at 11:56 PM
-- Server version: 5.7.39
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cst339`
--

-- --------------------------------------------------------

--
-- Table structure for table `ORDERS`
--

CREATE TABLE `ORDERS` (
  `ID` int(11) NOT NULL,
  `ORDER_NO` varchar(25) NOT NULL,
  `PRODUCT_NAME` varchar(128) NOT NULL,
  `PRICE` float NOT NULL,
  `QUANTITY` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ORDERS`
--

INSERT INTO `ORDERS` (`ID`, `ORDER_NO`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`) VALUES
(1, '0000000000', 'This is Product 1', 1, 1),
(2, '0000000001', 'This is Product 2', 2, 2),
(3, '0000000002', 'This is Product 3', 3, 3),
(4, '0000000003', 'This is Product 4', 4, 4),
(5, '0000000004', 'This is Product 5', 5, 5),
(6, '0000000005', 'This is Product 6', 6, 6),
(7, '0000000006', 'This is Product 7', 7, 7),
(8, '0000000007', 'This is Product 8', 8, 8),
(9, '0000000008', 'This is Product 9', 9, 9),
(10, '0000000009', 'This is Product 10', 10, 10),
(11, '0000000100', 'This is Product 100', 10, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ORDERS`
--
ALTER TABLE `ORDERS`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ORDERS`
--
ALTER TABLE `ORDERS`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
