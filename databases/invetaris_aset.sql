-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2023 at 01:35 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `invetaris_aset`
--

-- --------------------------------------------------------

--
-- Table structure for table `aset_terjual`
--

CREATE TABLE `aset_terjual` (
  `id_jual` varchar(100) NOT NULL,
  `terjual` varchar(100) NOT NULL,
  `nama_aset` varchar(100) NOT NULL,
  `jumlah_aset` varchar(100) NOT NULL,
  `harga_aset` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `aset_terjual`
--

INSERT INTO `aset_terjual` (`id_jual`, `terjual`, `nama_aset`, `jumlah_aset`, `harga_aset`) VALUES
('1', 'dian', 'yoyo', '1', '200'),
('2', 'yaya', 'bola', '1', '200'),
('3', 'dian', 'yoyo', '1', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `input_aset`
--

CREATE TABLE `input_aset` (
  `id_aset` varchar(100) NOT NULL,
  `nama_aset` varchar(100) NOT NULL,
  `tanggal_transaksi` varchar(100) NOT NULL,
  `harga_aset` varchar(100) NOT NULL,
  `jumlah` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `input_aset`
--

INSERT INTO `input_aset` (`id_aset`, `nama_aset`, `tanggal_transaksi`, `harga_aset`, `jumlah`) VALUES
('1', 'motor', '20-19-2002', '2000', '5'),
('2', 'mobil', '10-20-1999', '5000', '3');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(100) NOT NULL,
  `tanggal_transaksi` varchar(100) NOT NULL,
  `jumlah_aset` varchar(100) NOT NULL,
  `harga_aset` varchar(100) NOT NULL,
  `nama_aset` varchar(100) NOT NULL,
  `total_jumlah` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `tanggal_transaksi`, `jumlah_aset`, `harga_aset`, `nama_aset`, `total_jumlah`) VALUES
('1', '10-20-2001', '5', '2000', 'yoyo', '10000'),
('2', '10-02-2001', '3', '1000', 'ps', '3000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aset_terjual`
--
ALTER TABLE `aset_terjual`
  ADD PRIMARY KEY (`id_jual`);

--
-- Indexes for table `input_aset`
--
ALTER TABLE `input_aset`
  ADD PRIMARY KEY (`id_aset`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
