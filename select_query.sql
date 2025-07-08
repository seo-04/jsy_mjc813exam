-- 판매정보 개별데이터 조회
SELECT
	st.id
	, st.product
	, st.price
	, st.qty
	, st.discount
	, st.price * st.qty - st.discount AS prc
	, ct.name
	, IFNULL(lt.location, '') loca
FROM saled_tbl st
INNER JOIN contact_tbl AS ct
	ON st.contact_id = ct.id
LEFT JOIN location_tbl AS lt
	ON st.location_id = lt.id
WHERE 1=1
-- AND IFNULL(lt.location, '') LIKE '%강%'
;

-- 수강정보 개별데이터 조회
SELECT
	ct.name
	, ct.email
	, lt.score
--	, lt.id
	, lt2.subject
	, lt2.teacher
	, lt2.room_num 
	, lt2.start_dt
	, lt2.end_dt
FROM learn_tbl lt
INNER JOIN lecture_tbl lt2 
	ON lt.lecture_id = lt2.id
INNER JOIN contact_tbl ct 
	ON ct.id = lt.contact_id
WHERE start_dt <= '2025-08-30'
ORDER BY start_dt
;



update learn_tbl set score = 90 where id = 1;
update learn_tbl set score = 95 where id = 2;
update learn_tbl set score = 80 where id = 3;
update learn_tbl set score = 85 where id = 4;
update learn_tbl set score = 80 where id = 5;
update learn_tbl set score = 75 where id = 6;
update learn_tbl set score = 70 where id = 7;

select * from learn_tbl;
select * from saled_tbl;
insert into saled_tbl(sale_dt,price,qty,product,discount,location_id,contact_id)values
('2025-07-04',2500,3,'두유',500,2,8),
('2025-07-03',3000,4,'호빵',600,2,9),
('2025-07-04',1000,5,'초콜릿',100,2,10);











