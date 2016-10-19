USE velo_rent;

CREATE TABLE Accessorie (
  ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  goodName VARCHAR(255) NOT NULL,
  description VARCHAR(755) NOT NULL,
  price FLOAT NOT NULL,
  quantity INTEGER NOT NULL
);


INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('����������� � ������', '�������� �������� ��� ��������� � ������� ����������.', '27.20', '30');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('����� ���������� �����', '�������� ���������� ����� � ����������, ��� ������� �����������.', '14.20', '10');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('����� ������������', '������ � �������� �����-�������� ��� ����������.', '27.20', '20');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('�����������', '����������� ��� ��������� � ������� ����������.', '15.60', '10');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('������������ ������� 711', '�������� ������������. ����, ������, � ��������� ��������.', '23.70', '23');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('��������� ������� GHL', '��������� � ������� �����������. � ���������: ���������-��������� �� ������������ �����. ', '25.00', '10');
INSERT INTO Accessorie (goodName, description, price, quantity) VALUES ('������������� ������������ Junsd', ' � �������� ������: ������,  ������ �� �����, ���������.', '63.00', '10');



CREATE TABLE Bicycle (
  ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  goodName VARCHAR(255) NOT NULL,
  description VARCHAR(755) NOT NULL,
  price FLOAT NOT NULL,
  quantity INTEGER NOT NULL
);


INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� ������ Amigo', '��������� ������������ ��� �����.', '188.03', '10');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� ������ Amigo Alto 26', '������� ����� ������� � ������������ ��������, Alto-����� � ����� ���.', '288.03', '10');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� ������������ (�����)', '�������� �������� ����, ������ 13,5 ", ��� ���������� 14, 5 ��, 1-��������, ������� ������������� ������, ����������� ����, ������ ������ ������, ��������, ������� ����, �������.', '264.40', '20');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('������������ ������� ��������� ', '�������-�����������, ������������ ���������-���������� Lexus, ��� ����� �� 1 ����.', '184.00', '10');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� � ���������� ����� Amigo Zorro', '������� ���������, �� ���������� ����. ����� �����, ������� ���������. �� ����� � �������� - ��������� ���!', '382.50', '30');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� Amigo Alto 26', '��������� � ������� �����������.', '350.00', '15');
INSERT INTO Bicycle (goodName, description, price, quantity) VALUES ('��������� Zorro', '������� ���������, �� ���������� ����. ����� �����, ������� ���������. �� ����� � �������� - ��������� ���!', '365.00', '20');



CREATE TABLE Pump (
  ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  goodName VARCHAR(255) NOT NULL,
  description VARCHAR(755) NOT NULL,
  price FLOAT NOT NULL,
  quantity INTEGER NOT NULL
);

INSERT INTO Pump (goodName, description, price, quantity) VALUES ('����� ��� �������������� Giyo GF-39', '���������, ������ ����\����\��������� ������� ��������. ����� ��������� ��������.', '58.90', '10');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('����� ������������, ������, ��������� Giyo GM-71', '��������� ����-�����. ����� ������� ������ ��� ��������� �������������. T-�������� ������������ ����� �����.', '36.30', '15');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('����� ��� ����������� ������, ��������� KP-309', '��������� ����\����\��������� ��� ���. ��� ���������. ���������� ��������.', '43.10', '20');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('��������� ��������������� HP-10', '���������� ���������, ��������������� ������ ����������, � ���������� �� ���� ����������.', '11.10', '25');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('��������� ��������������� HP-04', '����������, ��������������� ������ ����������, � ���������� �� ���� ����������.  ����� �������� ������ �������.', '8.90', '10');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('��������� Bee S-295-7', '�������� ������ � ������������ ��������� �� �������� �����������.  ����� ���������� � ����� ������.', '6.00', '25');
INSERT INTO Pump (goodName, description, price, quantity) VALUES ('��������� ��������������� HP-01', '����������, ��������������� ������ ����������, � ���������� �� ���� ����������.  ����� �������� ������ �������.', '8.90', '20');


