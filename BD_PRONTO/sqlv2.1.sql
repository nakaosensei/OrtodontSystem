DROP DATABASE IF EXISTS DENTARIA;
CREATE DATABASE DENTARIA;
USE DENTARIA;

CREATE TABLE endereco(
  id INTEGER NOT NULL AUTO_INCREMENT,
  rua VARCHAR(50),
  numero integer,
  cidade VARCHAR(50),
  cep integer,
  estado VARCHAR(50),
  bairro VARCHAR(50),
  complemento VARCHAR(50),
  PRIMARY KEY(id)
);



CREATE TABLE cliente(
  id INTEGER NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50),
  cpf integer,
  rg integer,
  telfixo1 integer,
  telfixo2 integer,
  telcelular1 integer,
  telcelular2 integer,
  idEnderecoCasa integer,
  idEnderecoTrab integer,
  FOREIGN KEY (idEnderecoCasa) REFERENCES endereco(id),
  FOREIGN KEY (idEnderecoTrab) REFERENCES endereco(id),
  PRIMARY KEY(id)
);

CREATE TABLE clientedependente(
  parentesco VARCHAR(50),
  id INTEGER NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50),
  cpf integer,
  rg integer,
  telfixo1 integer,
  telfixo2 integer,
  telcelular1 integer,
  telcelular2 integer,
  idEnderecoCasa integer,
  idEnderecoTrab integer,
  idClienteResponsavel integer NOT NULL,
  FOREIGN KEY (idEnderecoCasa) REFERENCES endereco(id),
  FOREIGN KEY (idEnderecoTrab) REFERENCES endereco(id),
  FOREIGN KEY (idClienteResponsavel) REFERENCES cliente(id),
  PRIMARY KEY(id)
);

CREATE TABLE fichaClinica(
  id INTEGER NOT NULL AUTO_INCREMENT,
  indicaçao VARCHAR(50),
  atendimentoinicial VARCHAR(50),
  numeroprotocolo integer,
  idCliente INTEGER,
  idClienteResponsavel INTEGER,
  PRIMARY KEY(id),
  FOREIGN KEY(idCliente) REFERENCES cliente(id),
  FOREIGN KEY(idClienteResponsavel) REFERENCES cliente(id)
);


CREATE TABLE fichaAnamnese(
  id INTEGER NOT NULL AUTO_INCREMENT,
  queixaPrincipal VARCHAR(200),
  doencaAtual VARCHAR(100),
  estatratamentoMedico integer,
  nomeMedicoAssistente VARCHAR(50),
  telefoneMedicoAssistente integer,
  usaMedicacao integer,
  hasAlergia integer,
  hasAnemia integer,
  hasHepatite integer,
  hasSifilis integer,
  hasHiv integer,
  hasTuberculose integer,
  hasAsma integer,
  isfUmante integer,
  hasHormonios integer,
  isAlcoolista integer,
  hasHerpes integer,
  hasGravidez integer,
  hasDesmaios integer,
  hasFebrereumatica integer,
  hasDiabetes integer,
  hasEpilepsia integer,
  hasCicatrizacaoruim integer,
  hasDisturbiopsicologico integer,
  hasEndocarditebacteriana integer,
  hasProblemahepatico integer,
  hasProblemarenal integer,
  hasProblemacardiaco integer,
  hasProblemasarticularesreumaticos integer,
  hasTensaoarterial integer,
  hasCirurgiacominternacaohospilar integer,
  doencaInfectocontagiosa VARCHAR(100),
  PRIMARY KEY (id)
);




CREATE TABLE odontograma(
  id INTEGER NOT NULL AUTO_INCREMENT,
  d0 integer,
  d1 integer,
  d2 integer,
  d3 integer,
  d4 integer,
  d5 integer,
  d6 integer,
  d7 integer,
  d8 integer,
  d9 integer,
  d10 integer,
  d11 integer,
  d12 integer,
  d13 integer,
  d14 integer,
  d15 integer,
  d16 integer,
  d17 integer,
  d18 integer,
  d19 integer,
  d20 integer,
  d21 integer,
  d22 integer,
  d23 integer,
  d24 integer,
  d25 integer,
  d26 integer,
  d27 integer,
  d28 integer,
  d29 integer,
  d30 integer,
  s0 integer,
  s1 integer,
  s2 integer,
  s3 integer,
  s4 integer,
  s5 integer,
  s6 integer,
  s7 integer,
  s8 integer,
  s9 integer,
  s10 integer,
  s11 integer,
  s12 integer,
  s13 integer,
  s14 integer,
  s15 integer,
  s16 integer,
  s17 integer,
  s18 integer,
  s19 integer,
  s20 integer,
  s21 integer,
  s22 integer,
  s23 integer,
  s24 integer,
  s25 integer,
  s26 integer,
  s27 integer,
  s28 integer,
  s29 integer,
  s30 integer,
  PRIMARY KEY (id)
);

CREATE TABLE tratamento(
	id INTEGER NOT NULL AUTO_INCREMENT,
    nrProtocolo INTEGER NOT NULL,
    valorCombinadoTratamento DOUBLE,
    valorCombinadoPecas DOUBLE,
    idFichaAnamnese INTEGER,
    idOdontograma INTEGER,
    idCliente INTEGER,    
    PRIMARY KEY(id)
    
);
CREATE TABLE agenda(
	id INTEGER NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id)
    
);
CREATE TABLE evento(
	id INTEGER NOT NULL AUTO_INCREMENT,
    idAgenda INTEGER NOT NULL,
    idCliente INTEGER NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente(id),
    FOREIGN KEY (idAgenda) REFERENCES agenda(id),
    PRIMARY KEY(id)    
);


CREATE TABLE procedimentoDoDente(
	id INTEGER NOT NULL AUTO_INCREMENT,
    dente INTEGER,
    regiao INTEGER,
    face INTEGER,
    procedimentoIndicado VARCHAR(200),
    idTratamento INTEGER NOT NULL,
    FOREIGN KEY (idTratamento) REFERENCES tratamento(id),
    PRIMARY KEY(id)
);



CREATE TABLE dentista(
  id INTEGER NOT NULL AUTO_INCREMENT,
  login VARCHAR(70),
  passwd VARCHAR(50),
  nome VARCHAR(50),
  cpf integer,
  rg integer,
  telfixo1 integer,
  telfixo2 integer,
  telcelular1 integer,
  telcelular2 integer,
  rgorgaoexpedidor VARCHAR(50),
  sexo character(1),
  estadocivil character(1),
  email VARCHAR(50),
  datanascimento date,
  idEndereco INTEGER,
  idAgenda INTEGER,
  PRIMARY KEY(id),
  FOREIGN KEY(idAgenda) REFERENCES agenda(id),
  FOREIGN KEY (idEndereco) REFERENCES endereco(id)
);


CREATE TABLE secretaria(
  id INTEGER NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50),
  login VARCHAR(70),
  passwd VARCHAR(50),
  cpf integer,
  rg integer,
  telfixo1 integer,
  telfixo2 integer,
  telcelular1 integer,
  telcelular2 integer,
  rgorgaoexpedidor VARCHAR(50),
  sexo character(1),
  estadocivil character(1),
  email VARCHAR(50),
  datanascimento date,
  idEndereco INTEGER,
  idAgenda INTEGER,
  PRIMARY KEY(id),
  FOREIGN KEY(idAgenda) REFERENCES agenda(id),
  FOREIGN KEY (idEndereco) REFERENCES endereco(id)
);
CREATE TABLE recibo(
	nrRecibo INTEGER NOT NULL,
    valor FLOAT,
    descricaoServico VARCHAR(800),
    data DATE,
    idEmitente INTEGER,
    idCliente INTEGER,
    PRIMARY KEY(nrRecibo),
    FOREIGN KEY (idEmitente) REFERENCES dentista(id),
    FOREIGN KEY (idCliente) REFERENCES cliente(id)
    
);
