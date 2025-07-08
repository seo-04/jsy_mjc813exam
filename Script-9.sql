select * from contact_tbl;
select * from saled_tbl;
select * from location_tbl;

select * from learn_tbl;
select * from lecture_tbl;

// 첫 번째
INSERT INTO contact_tbl(id, name, phonenumber, zipnumber, email, addr)
VALUES 
(1,'김김김','010-1111-1111','111','kim@gmail.com','서대문구'),
(2,'박박박','010-2222-2222','222','park@gmail.com','강동구'),
(3,'진진진','010-3333-3333','333','jin@gmail.com','강서구'),
(4,'이이이','010-4444-4444','444','lee@gmail.com','잠실')


INSERT INTO saled_tbl(sale_dt,price,qty,product,location_id,discount,contact_id) 
values
('2025-06-30',30000,3,'막창',1,500,1),
('2025-07-01',20000,4,'삽겹살',2,1000,2),
('2025-07-02',50000,5,'한우',3,2000,3),
('2025-07-03',30000,2,'곱창',4,3000,4)

INSERT INTO location_tbl(id,location) 
values
(5,'인천'),
(6,'서울'),
(7,'경기'),
(8,'부산')

// 첫 번째 select 문(inner join)
SELECT 
  s.id AS sale_id,
  s.sale_dt AS 판매일자,
  s.product AS 제품명,
  s.price AS 단가,
  s.qty AS 수량,
  s.discount AS 할인,
  (s.price * s.qty - s.discount) AS 총급액,
  c.name AS 판매자,
  l.location AS 배송지
FROM saled_tbl s
INNER JOIN contact_tbl c ON s.contact_id = c.id
INNER JOIN location_tbl l ON s.location_id = l.id;

// 두 번째
INSERT INTO learn_tbl(id,lecture_id,score) 
values
(10,1,30),
(11,2,90),
(12,3,80)

INSERT INTO lecture_tbl(id, subject,teacher,room_num,start_dt,end_dt)
VALUES 
(10,'객체지향언어','김김김',1,'2025-03.26','2025-06.20'),
(11,'자료구조','박박박',2,'2024-03.26','2024-06.20'),
(12,'c언어','이이이',3,'2024-09.04','2025-12.10'),
(13,'데이터베이스','최최최',4,'2024-09.04','2025-12.10')

// 두 번째 select 문(inner join)
select 
l.id as 수강번호,
lec.subject as 과목명,
lec.teacher as 교수명,
lec.room_num as 강의실,
lec.start_dt as 시작일,
lec.end_dt as 종료일,
l.score as 성적
from learn_tbl l
inner join lecture_tbl lec on l.lecture_id;
