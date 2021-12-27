INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	1	,'Moda',	1	,	null	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	2	,'Elektronik',	1	,	null	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	3	,'Ev & Yaşam',	1	,	null	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	4	,'Elbise',	2	,	1	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	5	,'Gömlek',	2	,	1	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	6	,'Bilgisayar',	2	,	2	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	7	,'Dizüstü Bilgisayar',	3	,	6	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	8	,'Mobilya',	2	,	3	);
INSERT INTO public.KATEGORI( ID, ADI, KIRILIM, id_ust_kategori)  VALUES (	9	,'Sehpa',	3	,	8	);

INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    1    ,'Mavi Elbise',    200    , now(),     4);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    2    ,'Kırmızı Elbise',    300    , now(),     4);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    3    ,'Mavi Gömlek',    500    , now(),     5);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    4    ,'Sarı Gömlek',    450    , now(),     5);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    5    ,'HP ',    15000    , now(),     7);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    6    ,'MSI',    20000    , now(),     7);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, id_kategori) VALUES (    7    ,'Orta Sehpa',    600    , now(),     9);


INSERT INTO customer (id,  last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae35' ,'kesici' , 'smtksc54@mail.com' , 'samet', 534434,'smtkesici');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae36' , 'yuncu' , 'ynckc21@mail.com' , 'mamo', 53475454,'ruthless');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae43' , 'kucuk' , 'tereass11@mail.com' , 'ahmet', 534321312 ,'paintedman');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae42' , 'dag' , 'dagdag@mail.com' , 'kubra', 5347654,'blabla');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae41', 'keskin' , 'keskin@mail.com' , 'dilara', 534765654 ,'loremipsum');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae38' , 'ural' , 'ural@mail.com' , 'yasin', 534723213, 'kesici54');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae39' , 'erdem' , 'erdem@mail.com' , 'yagmur', 53475545 , 'daggg');
INSERT INTO customer (id , last_name , mail , name , phone_number , user_name) values ('7692a95e-4365-44a8-aacd-875b187cae40' , 'yildiz' , 'yildiz@mail.com' , 'kader', 534725411 , 'aslan');

INSERT INTO customer_review (id,  review , review_date , product_id , customer_id)  values ('074dc1f6-6756-485d-b5b5-13b3491c6c36','guzel urun' , now() , 7, '7692a95e-4365-44a8-aacd-875b187cae35');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c37' , 'kotu urun' , now()  , 2, '7692a95e-4365-44a8-aacd-875b187cae35');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c38' , 'kullanıslı' , now() , 3, '7692a95e-4365-44a8-aacd-875b187cae36');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c39' , 'gosterildigi gibi' , now()  , 3, '7692a95e-4365-44a8-aacd-875b187cae42');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c30' , 'kargo gelmedi' , now()  , 3, '7692a95e-4365-44a8-aacd-875b187cae35');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c31' , 'yalan urun' , now()  , 2, '7692a95e-4365-44a8-aacd-875b187cae39');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c32' , 'kullanıssız' , now()  , 5, '7692a95e-4365-44a8-aacd-875b187cae42');
INSERT INTO customer_review (id , review , review_date , product_id , customer_id ) values ('074dc1f6-6756-485d-b5b5-13b3491c6c33' , 'gereksiz' , now()  , 6, '7692a95e-4365-44a8-aacd-875b187cae40');

