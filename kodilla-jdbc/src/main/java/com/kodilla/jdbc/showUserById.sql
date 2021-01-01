DROP FUNCTION IF EXISTS showUserById;
DELIMITER $$
CREATE FUNCTION showUserById(user_id INT) RETURNS VARCHAR(100) DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(100);
    IF user_id > 0 THEN
        SELECT U.FIRSTNAME INTO result FROM USERS U
        WHERE U.ID = user_id;
    ELSE
        SET result = 'id must not be less or equal to zero!';
    END If;
    return result;
END $$
DELIMITER ;

SELECT showUserById(1) AS Found_Users;
