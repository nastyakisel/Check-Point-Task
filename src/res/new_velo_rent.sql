USE velo_rent;

CREATE TABLE Category (
  ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  categoryName VARCHAR(255) NOT NULL
);

INSERT INTO Category (ID, categoryName) VALUES ('1', 'Accessorie');
INSERT INTO Category (ID, categoryName) VALUES ('2', 'Bicycle');
INSERT INTO Category (ID, categoryName) VALUES ('3', 'Pump');

CREATE TABLE Velogoods (
  ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  goodName VARCHAR(255) NOT NULL,
  description VARCHAR(755) NOT NULL,
  price FLOAT NOT NULL,
  quantity INTEGER NOT NULL,
  FK_Category_ID INTEGER NOT NULL,
	CONSTRAINT FK_Category FOREIGN KEY (FK_Category_ID) REFERENCES Category (ID)
	ON DELETE cascade
    ON UPDATE cascade
);


INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����������� � ������', '�������� �������� ��� ��������� � ������� ����������.', '27.20', '30', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����� ���������� �����', '�������� ���������� ����� � ����������, ��� ������� �����������.', '14.20', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����� ������������', '������ � �������� �����-�������� ��� ����������.', '27.20', '20', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('�����������', '����������� ��� ��������� � ������� ����������.', '15.60', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('������������ ������� 711', '�������� ������������. ����, ������, � ��������� ��������.', '23.70', '23', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ������� GHL', '��������� � ������� �����������. � ���������: ���������-��������� �� ������������ �����.', '25.00', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('������������� ������������ Junsd', ' � �������� ������: ������,  ������ �� �����, ���������.', '63.00', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ������ Amigo', '��������� ������������ ��� �����.', '188.03', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ������ Amigo Alto 26', '������� ����� ������� � ������������ ��������, Alto-����� � ����� ���.', '288.03', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ������������ (�����)', '�������� �������� ����, ������ 13,5 ", ��� ���������� 14, 5 ��, 1-��������, ������� ������������� ������, ����������� ����, ������ ������ ������, ��������, ������� ����, �������.', '264.40', '20', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('������������ ������� ��������� ', '�������-�����������, ������������ ���������-���������� Lexus, ��� ����� �� 1 ����.', '184.00', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� � ���������� ����� Amigo Zorro', '������� ���������, �� ���������� ����. ����� �����, ������� ���������. �� ����� � �������� - ��������� ���!', '382.50', '30', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� Amigo Alto 26', '��������� � ������� �����������.', '350.00', '15', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� Zorro', '������� ���������, �� ���������� ����. ����� �����, ������� ���������. �� ����� � �������� - ��������� ���!', '365.00', '20', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����� ��� �������������� Giyo GF-39', '���������, ������ ����\����\��������� ������� ��������. ����� ��������� ��������.', '58.90', '10', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����� ������������, ������, ��������� Giyo GM-71', '��������� ����-�����. ����� ������� ������ ��� ��������� �������������. T-�������� ������������ ����� �����.', '36.30', '15', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('����� ��� ����������� ������, ��������� KP-309', '��������� ����\����\��������� ��� ���. ��� ���������. ���������� ��������.', '43.10', '20', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ��������������� HP-10', '���������� ���������, ��������������� ������ ����������, � ���������� �� ���� ����������.', '11.10', '25', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ��������������� HP-04', '����������, ��������������� ������ ����������, � ���������� �� ���� ����������.  ����� �������� ������ �������.', '8.90', '10', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� Bee S-295-7', '�������� ������ � ������������ ��������� �� �������� �����������.  ����� ���������� � ����� ������.', '6.00', '25', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('��������� ��������������� HP-01', '����������, ��������������� ������ ����������, � ���������� �� ���� ����������.  ����� �������� ������ �������.', '8.90', '20', '3');










