-- -- bicycles table
-- INSERT INTO bicycles (id, quantity, name, brand, price, img_url, color, weight, frame_size, wheel_size,
--                       number_of_gears, specification_url)
-- VALUES
--     (1001,17,'Mustang M2','Romet' ,2500.00,'https://romet.pl/picture/fit-in/988x988/filters:fill(white)/3bc46f88aa7bd42b861cb1b030abb550.jpg','czerwony',14.5,17,29,27,'https://romet.pl/rower-gorski-romet-mustang-m2-2023-9'),
--     (1002,10,'Mustang M2','Romet' ,2500.00,'https://image.ceneostatic.pl/data/products/147406899/i-romet-mustang-m2-czarny-zielony-29-2020.jpg','czarno-zielony',14.5,17,29,27,'https://romet.pl/rower-gorski-romet-mustang-m2-2023-9'),
--     (1003,15,'Mustang M2','Romet' ,2600.00,'https://republikarowerowa.pl/12648/rower-romet-mustang-m2-2023.jpg','szary',14.9,21,29,27,'https://romet.pl/rower-gorski-romet-mustang-m2-2023-2'),
--     (1004,19,'Level 5.0','Kross', 3700.00,'https://gw-01-img.shopelo.pl/andzik-rkwghspcjx1att20_500/rower-gorski-kross-level-50-m-29-czarno-czerwono-srebrny-1.png','czarno-czerwony',13.68,19,29,27,'https://kross.eu/pl/rowery/gorskie/mtb-xc/level-5-0-fsa-czarny-srebrny-polysk'),
--     (1005,19,'Level 5.0','Kross', 3800.00,'https://kross.eu/media/cache/gallery/rc/kiufo3a5/images/50/50994/KRLV5Z29X19M005363-KR_LEVEL_5.0_NIEB_SRE_P-3.jpg','niebieski',13.85,20,29,27,'https://kross.eu/pl/rowery/gorskie/mtb-xc/level-5-0-fsa-niebieski-srebrny-polysk'),
--     (1006,14,'Level 5.0','Kross', 3850.00,'https://kross.eu/media/cache/gallery/rc/wzsyfflq/images/38/38477/KRLV5Z29X22M002358-KR-Level-5.0-XXL-czarny-srebrny-po%C5%82ysk-g.jpg','czarno-srebrny',13.78,19,29,27,'https://kross.eu/pl/rowery/gorskie/mtb-xc/level-5-0-czarny-srebrny-polysk-1'),
--     (1007,30,'Evado 3.0','Kross', 2200.00,'https://kross.eu/media/cache/gallery/rc/yf3dfywg/images/42/42686/KREV3Z28X21M003611-KR-Evado-3.0_cza_pom-1.jpg','czarno-pomarańczowy',13.5,19,28,24,'https://kross.eu/pl/rowery/turystyczne/cross/evado-3-0-czarny-pomaranczowy-polysk'),
--     (1008,20,'Evado 3.0','Kross', 2250.00,'https://kross.eu/media/cache/gallery/rc/yf3dfywg/images/42/42686/KREV3Z28X21M003611-KR-Evado-3.0_cza_pom-1.jpg','czarno-pomarańczowy',13.6,21,28,24,'https://kross.eu/pl/rowery/turystyczne/cross/evado-3-0-czarny-pomaranczowy-polysk'),
--     (1009,20,'Rambler R6.4','Romet',2200.00,'https://rower.com.pl/images/cache/3/rower-mlodziezowy-romet-rambler-r6-4-2307977-1000x680.jpg','biały',13.8,18,26,24,'https://romet.pl/rower-gorski-romet-rambler-r64-2022'),
--     (1010,18,'Rambler R6.4','Romet',2300.00,'https://romet.pl/picture/fit-in/988x988/filters:fill(white)/4c551dd32f817453057562cce607ce07.jpg','czarno-pomarańczowy',14,20,26,24,'https://romet.pl/rower-gorski-romet-rambler-r64-2022-1'),
--     (1011,5,'Hexagon 5.0','Kross ',2500.00,'https://kross.eu/media/cache/gallery/rc/0abseisn/images/42/42470/KRHE5Z27X15M003575-KR-Hexagon-5.0-%20%E2%80%94%20kopia%20%281%29.jpg','czarno-limonkowo-szary',14.28,17,29,24,'https://kross.eu/pl/rowery/gorskie/mtb/hexagon-5-0-czarny-limonkowy-szary-polysk'),
--     (1012,20,'Romet Mustang M2', 'Romet',2500.00,'https://th.bing.com/th/id/OIP.uWygbGWZJiCGOpiWqFhh5gHaE8?w=290&h=193&c=7&r=0&o=5&dpr=1.3&pid=1.7','czerwony',14.5,19,29,27,'https://romet.pl/rower-gorski-romet-mustang-m2-2023-9'),
--     (1013,10,'Kross Level 5.0',' Kross',3800.00,'https://kross.eu/media/cache/gallery/rc/mi5wp4ru/images/38/38481/KRLV5Z29X17M002361-KR-Level-5.0-niebieski-srebrny-po%C5%82ysk-g.jpg','niebiesko-srebrny',13.78,19,29,27,'https://kross.eu/pl/rowery/gorskie/mtb-xc/level-5-0-fsa-czarny-srebrny-polysk');
--
-- -- opinions table
-- INSERT INTO opinions (id, created_at, name, opinion)
--
-- VALUES
--     (1001, '2023-09-17 13:58:43.182000', 'Jan Nowak', 'Jestem bardzo zadowolony z zakupionego roweru, jak i z bardzo bardzo szybko zrealizowanego zamówienia.'),
--     (1002, '2023-09-17 14:00:14.879000', 'Ilona Gołda', 'Super sklep!!! Bardzo miła obsługa klienta, zdecydowanie polecam.'),
--     (1003, '2023-09-17 14:02:19.117000', 'Bronisław Gąsienica', 'Rower dotarł szybko, w dobrze zabezpieczonym pudle. Dzięki prostej instrukcji dołączonej do przesyłki zmontowanie roweru nie zajęło mi więcej niż 30 min.'),
--     (1004, '2023-09-17 14:03:35.650000', 'Ewa Podolecka', 'Gorąco polecam ten sklep internetowy - oferują świetny sprzęt w bardzo przystępnych cenach!');

