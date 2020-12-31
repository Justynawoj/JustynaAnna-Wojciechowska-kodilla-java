DROP PROCEDURE IF EXISTS UpdateBestsellers;

DELIMITER $$

CREATE PROCEDURE UpdateBestsellers()
BEGIN
    DECLARE BESTSELLER BIT;
    DECLARE TOTAL_RENTS_OF_BOOK, BKS_ID, DAYS INT;
    DECLARE AVG_RENTS_NUMBER DECIMAL(4, 1);
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS_CURSOR CURSOR FOR SELECT BOOK_ID FROM BOOKS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;

    OPEN ALL_BOOKS_CURSOR;
    WHILE(FINISHED = 0)
        DO
            FETCH ALL_BOOKS_CURSOR INTO BKS_ID;
            IF (FINISHED = 0) THEN
                SELECT COUNT(*)
                FROM RENTS
                WHERE BOOK_ID = BKS_ID
                INTO TOTAL_RENTS_OF_BOOK;

                SELECT DATEDIFF(MAX(RENT_DATE), MIN(RENT_DATE)) + 1
                FROM RENTS
                WHERE BOOK_ID = BKS_ID
                INTO DAYS;

                SET AVG_RENTS_NUMBER = TOTAL_RENTS_OF_BOOK / DAYS * 30;
                IF (AVG_RENTS_NUMBER > 2) THEN
                    UPDATE BOOKS
                    SET BESTSELLER = 1
                    WHERE BOOK_ID = BKS_ID;
                ELSE
                    UPDATE BOOKS
                    SET BESTSELLER = 0
                    WHERE BOOK_ID = BKS_ID;
                    COMMIT;
                END IF;
            END IF;
        END WHILE;
    CLOSE ALL_BOOKS_CURSOR;

END $$

DELIMITER ;

call UpdateBestsellers();
select * from BOOKS;
