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


INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велокорзина с ручкой', 'Стальная корзинка для дорожного и горного велосипеда.', '27.20', '30', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Набор приставных колес', 'Комплект приставных колес с креплением, для детских велосипедов.', '14.20', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Щитки велосипедные', 'Задний и передний щиток-болотник для велосипеда.', '27.20', '20', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велозеркало', 'Велозеркало для дорожного и горного велосипеда.', '15.60', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велоперчатки осенние 711', 'Перчатки велосипедные. Кожа, лайкра, с закрытыми пальцами.', '23.70', '23', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велозамок кодовый GHL', 'Велозамок с кодовым управлением. В комплекте: кронштейн-держатель на подседельный палец.', '25.00', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велокомпьютер беспроводной Junsd', ' В комплект входит: провод,  датчик на спицу, батарейка.', '63.00', '10', '1');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед горный Amigo', 'Велосипед предназначен для детей.', '188.03', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед горный Amigo Alto 26', 'Высокий будет ребенок в подростковом возрасте, Alto-будет в самый раз.', '288.03', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед подростковый (Амиго)', 'Складная стальная рама, размер 13,5 ", вес велосипеда 14, 5 кг, 1-скорость, длинные хромированные крылья, алюминиевый обод, задний ножной тормоз, багажник, высокий руль, зеркало.', '264.40', '20', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Трехколесный детский велосипед ', 'Коляска-трансформер, трехколесный велосипед-управляшка Lexus, для детей от 1 года.', '184.00', '10', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед с заниженной рамой Amigo Zorro', 'Шустрый велосипед, на заниженной раме. Имеет яркую, броскую раскраску. По цвету и повадкам - настоящий Лис!', '382.50', '30', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед Amigo Alto 26', 'Велозамок с кодовым управлением.', '350.00', '15', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велосипед Zorro', 'Шустрый велосипед, на заниженной раме. Имеет яркую, броскую раскраску. По цвету и повадкам - настоящий Лис!', '365.00', '20', '2');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Насос для веломастерской Giyo GF-39', 'Напольный, ручной вело\мото\автонасос низкого давления. Имеет встроеный монометр.', '58.90', '10', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Насос велосипедный, ручной, напольный Giyo GM-71', 'Напольный вело-насос. Очень удобная модель для домашнего использования. T-образная складываемая ручка штока.', '36.30', '15', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Насос для велосервиса ножной, напольный KP-309', 'Напольный вело\мото\автонасос для ног. Два рессивера. Встроенный монометр.', '43.10', '20', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велонасос телескопический HP-10', 'Популярная карманная, телескопическая модель велонасоса, с креплением на раму велосипеда.', '11.10', '25', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велонасос телескопический HP-04', 'Популярная, телескопическая модель велонасоса, с креплением на раму велосипеда.  Имеет откидной прижим клапана.', '8.90', '10', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велонасос Bee S-295-7', 'Массовая модель с возможностью крепления на дорожных велосипедах.  Имеет встроенный в насос клапан.', '6.00', '25', '3');
INSERT INTO Velogoods (goodName, description, price, quantity, FK_Category_ID) VALUES ('Велонасос телескопический HP-01', 'Популярная, телескопическая модель велонасоса, с креплением на раму велосипеда.  Имеет откидной прижим клапана.', '8.90', '20', '3');










