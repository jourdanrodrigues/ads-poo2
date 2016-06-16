-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 17-Jun-2016 às 01:25
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Poo2Homework`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cliente`
--

CREATE TABLE `Cliente` (
  `nomeCompleto` varchar(60) NOT NULL,
  `email` varchar(40) NOT NULL,
  `cpf` char(11) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `rg` char(13) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `estado` varchar(40) NOT NULL,
  `cnh` varchar(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Cliente`
--

INSERT INTO `Cliente` (`nomeCompleto`, `email`, `cpf`, `telefone`, `rg`, `cidade`, `estado`, `cnh`, `id`) VALUES
('João do Caminhão', 'joaocaminhao@gmail.com', '12345678910', '85985471234', '20094715234', 'Fortaleza', 'Ceará', '12345678912', 1),
('Michael Teloso', 'michaelteloso@gmail.com', '12345678911', '85989421567', '20054618974', 'Fortaleza', 'Ceará', '123456879', 3),
('Jourdan Caetano', 'jourdancaetano@gmail.com', '1234568799', '85999471247', '12345678954', 'Fortaleza', 'Ceará', '123456789', 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Funcionario`
--

CREATE TABLE `Funcionario` (
  `id` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `cpf` char(11) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `rg` char(13) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `numeroPis` int(11) NOT NULL,
  `gerente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Funcionario`
--

INSERT INTO `Funcionario` (`id`, `nome`, `email`, `cpf`, `telefone`, `rg`, `endereco`, `login`, `senha`, `numeroPis`, `gerente`) VALUES
(1, 'Jourdan Rodrigues', 'thiagojourdan@gmail.com', '00000000000', '85999472102', '0000000000000', 'Rua Fagundes Varela, 817, Casa 7', 'jourdanr', '123456', 1234567891, 1),
(2, 'Flavio Ramos', 'flavioramos@gmail.com', '12345678912', '85999751234', '1234567891234', 'Rua Tal e Pa e Pou, 5', 'flavior', '123456', 123456789, 0),
(3, 'Giselle Almeida', 'gisellealmeida@gmail.com', '1234569871', '85985674123', '1234567896543', 'Rua tal e pa e pou', 'gisellea', '123456', 123654789, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Promocao`
--

CREATE TABLE `Promocao` (
  `id` int(11) NOT NULL,
  `desconto_perc` int(11) NOT NULL,
  `data_limite` date NOT NULL,
  `veiculo_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Promocao`
--

INSERT INTO `Promocao` (`id`, `desconto_perc`, `data_limite`, `veiculo_id`) VALUES
(1, 70, '2016-12-26', 1),
(2, 24, '2016-11-23', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Veiculo`
--

CREATE TABLE `Veiculo` (
  `id` int(11) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `fabricante` varchar(30) NOT NULL,
  `cor` varchar(30) NOT NULL,
  `chassi` char(17) NOT NULL,
  `ano` int(11) NOT NULL,
  `preco` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `Veiculo`
--

INSERT INTO `Veiculo` (`id`, `modelo`, `fabricante`, `cor`, `chassi`, `ano`, `preco`) VALUES
(1, 'Gol', 'volkswagen', 'Azul Claro', '12345678912345678', 2014, 12400.1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Venda`
--

CREATE TABLE `Venda` (
  `id` int(11) NOT NULL,
  `veiculo_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `promocao_id` int(11) DEFAULT NULL,
  `cliente_id` int(11) NOT NULL,
  `data` date NOT NULL,
  `forma_pagamento` varchar(20) NOT NULL,
  `servicos_adicionais` varchar(140) NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `rg` (`rg`),
  ADD UNIQUE KEY `cnh` (`cnh`);

--
-- Indexes for table `Funcionario`
--
ALTER TABLE `Funcionario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numeroPis` (`numeroPis`);

--
-- Indexes for table `Promocao`
--
ALTER TABLE `Promocao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Veiculo`
--
ALTER TABLE `Veiculo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Venda`
--
ALTER TABLE `Venda`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `Funcionario`
--
ALTER TABLE `Funcionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `Promocao`
--
ALTER TABLE `Promocao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Veiculo`
--
ALTER TABLE `Veiculo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `Venda`
--
ALTER TABLE `Venda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
