CREATE TABLE IF NOT EXISTS organization(
    id           INTEGER        NOT NULL  PRIMARY KEY,  --COMMENT Уникальный ID организации
    version      INTEGER        NOT NULL,               --COMMENT Служебное поле hibernate
    name         VARCHAR(50)    NOT NULL,               --COMMENT Название организации
    fullName     VARCHAR(50)    NOT NULL,               --COMMENT Полное название
    address      VARCHAR(50)    NOT NULL,               --COMMENT Адрес
    phone        VARCHAR(30)    NOT NULL,               --COMMENT Телефон
    inn          VARCHAR(30)    NOT NULL,               --COMMENT ИНН
    kpp          VARCHAR(30)    NOT NULL,               --COMMENT КПП
    isActive     BOOLEAN        NOT NULL default false  --COMMENT Актуальность
);

CREATE UNIQUE INDEX orname_idx ON organization (name);
CREATE UNIQUE INDEX oractive_idx ON organization (isActive);

create table if not exists offices(
    orgId        INTEGER        NOT NULL,             --COMMENT Уникальный ID организации
    version      INTEGER        NOT NULL,             --COMMENT Служебное поле hibernate
    id           INTEGER        NOT NULL  PRIMARY KEY,--COMMENT Уникальный ID офиса
    name         VARCHAR(50)    NOT NULL,             --COMMENT Название офиса
    address      VARCHAR(50)    NOT NULL,             --COMMENT Адрес
    phone        VARCHAR(30),                         --COMMENT Телефон
    isActive     BOOLEAN       NOT NULL default false,--COMMENT Актуальность
    FOREIGN KEY (orgId) REFERENCES organization (ID)
);

CREATE INDEX oforgid_idx ON offices (orgId);
CREATE INDEX ofactive_idx ON offices (isActive);


CREATE TABLE IF NOT EXISTS users(
    id                INTEGER       NOT NULL  PRIMARY KEY,  --COMMENT Уникальный ID сотрудника
    version           INTEGER       NOT NULL,               --COMMENT Служебное поле hibernate
    orgId             INTEGER,                              --СOMMENT ID  организации
    officeId          INTEGER       NOT NULL,               --СOMMENT ID офиса
    firstName         VARCHAR(50)   NOT NULL,               --COMMENT Имя
    secondName        VARCHAR(50),                          --COMMENT Фамилия
    middleName        VARCHAR(50),                          --COMMENT Отчество
    position          VARCHAR(30)   NOT NULL,               --COMMENT Должность
    phone             VARCHAR(30),                          --COMMENT Телефон
    citizenshipID     INTEGER       NOT NULL,               --COMMENT ID страны
    isIdentified      BOOLEAN       NOT NULL  default false,--COMMENT Атуальность
    FOREIGN KEY (citizenshipID) REFERENCES citizenship (citizenshipID),
    FOREIGN KEY (id) REFERENCES docname (usID)
);

CREATE INDEX usorgid_idx ON users (orgId);
CREATE INDEX usofid_idx ON users (officeId);
CREATE INDEX uspos_idx ON users (position);
CREATE INDEX usactive_idx ON users (isIdentified);


CREATE TABLE IF NOT EXISTS docname(
    documentID       INTEGER       NOT NULL  PRIMARY KEY,  --COMMENT ID документа
    documentName     VARCHAR(30)   NOT NULL,              --COMMENT Название документа
    documentCode     INTEGER       NOT NULL,              --COMMENT Код документа
    UNIQUE(documentID,documentName, documentCode)
);


CREATE TABLE IF NOT EXISTS docdata(
    usID               INTEGER       NOT NULL PRIMARY KEY,  -- COMMENT ID сотрудника
    docID              INTEGER       NOT NULL,              --COMMENT ID документа
    docNumber          VARCHAR(20),                         --COMMENT Номер документа
    docDate            VARCHAR(20),                         --COMMENT Дата выдачи
    UNIQUE(usID),
    FOREIGN KEY (docID) REFERENCES docname (documentID) 
);


CREATE TABLE IF NOT EXISTS citizenship(
	citizenshipID     INTEGER      NOT NULL   PRIMARY KEY,  --COMMENT ID страны
	citizenshipName   VARCHAR(30)  NOT NULL,                --COMMENT Гражданство
	citizenshipCode   INTEGER      NOT NULL,               --COMMENT Код страны
);
