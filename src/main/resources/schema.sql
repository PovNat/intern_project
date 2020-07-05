CREATE TABLE IF NOT EXISTS organization(
	id           INTEGER        NOT NULL  PRIMARY KEY  --COMMENT Уникальный ID организации
    , name       VARCHAR(50)    NOT NULL               --COMMENT Название организации
	, fullName   VARCHAR(50)    NOT NULL               --COMMENT Полное название
	, address    VARCHAR(50)    NOT NULL               --COMMENT Адрес
	, phone      VARCHAR(30)    NOT NULL               --COMMENT Телефон
    , inn        VARCHAR(30)    NOT NULL               --COMMENT ИНН
    , kpp        VARCHAR(30)    NOT NULL               --COMMENT КПП
	, isActive   BOOLEAN                               --COMMENT Актуальность
);

CREATE TABLE IF NOT EXISTS officeIT(
	orgId         INTEGER        NOT NULL              --COMMENT Уникальный ID организации
	, id          INTEGER        NOT NULL  PRIMARY KEY --COMMENT Уникальный ID офиса
    , name        VARCHAR(50)    NOT NULL              --COMMENT Название офиса
	, address     VARCHAR(50)    NOT NULL              --COMMENT Адрес
    , phone       VARCHAR(30)                          --COMMENT Телефон
	, isActive    BOOLEAN                              --COMMENT Актуальность
);

CREATE TABLE IF NOT EXISTS officeRusOil(
	orgId         INTEGER        NOT NULL              --COMMENT Уникальный ID организации
	, id          INTEGER        NOT NULL  PRIMARY KEY --COMMENT Уникальный ID офиса
    , name        VARCHAR(50)    NOT NULL              --COMMENT Название офиса
	, address     VARCHAR(50)    NOT NULL              --COMMENT Адрес
    , phone       VARCHAR(30)                          --COMMENT Телефон
	, isActive    BOOLEAN                              --COMMENT Актуальность
);

CREATE TABLE IF NOT EXISTS office4wheels(
	orgId         INTEGER        NOT NULL              --COMMENT Уникальный ID организации
	, id          INTEGER        NOT NULL  PRIMARY KEY --COMMENT Уникальный ID офиса
    , name        VARCHAR(50)    NOT NULL              --COMMENT Название офиса
	, address     VARCHAR(50)    NOT NULL              --COMMENT Адрес
    , phone       VARCHAR(30)                          --COMMENT Телефон
	, isActive    BOOLEAN                              --COMMENT Актуальность
);

CREATE TABLE IF NOT EXISTS position(
    positionId      INTEGER     NOT NULL PRIMARY KEY  --COMMENT Уникальный ID должности
	, positionName  VARCHAR(30) NOT NULL              --COMMENT Название должности
);

CREATE TABLE IF NOT EXISTS document(
	documentID       INTEGER       NOT NULL PRIMARY KEY   --COMMENT ID документа
	, documentName   VARCHAR(30)   NOT NULL               --COMMENT Название документа
	, documentCode   INTEGER       NOT NULL               --COMMENT Код документа
);

CREATE TABLE IF NOT EXISTS citizenship(
	citizenshipID       INTEGER      NOT NULL   PRIMARY KEY  --COMMENT ID страны
	, citizenshipName   VARCHAR(30)  NOT NULL                --COMMENT Гражданство
	, citizenshipCode   INTEGER      NOT NULL                --COMMENT Код страны

);

CREATE TABLE IF NOT EXISTS users(
	id                  INTEGER        NOT NULL  PRIMARY KEY  --COMMENT Уникальный ID сотрудника
	, orgId             INTEGER                               --СOMMENT ID  организации
	, officeId          INTEGER        NOT NULL               --СOMMENT ID офиса
	, firstName         VARCHAR(50)    NOT NULL               --COMMENT Имя
    , secondName        VARCHAR(50)                           --COMMENT Фамилия
    , middleName        VARCHAR(50)                           --COMMENT Отчество
    , position          INTEGER        NOT NULL               --COMMENT Должность
    , phone             VARCHAR(30)                           --COMMENT Телефон
    , docName           INTEGER                               --COMMENT Название документа
    , docNumber         VARCHAR(20)                           --COMMENT Номер документа
    , docDate           VARCHAR(20)                           --COMMENT Дата выдачи
    , citizenshipCode   INTEGER                               --COMMENT Код страны
    , isIdentified      BOOLEAN                               --COMMENT Атуальность
);
