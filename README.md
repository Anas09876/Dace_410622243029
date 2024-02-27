CREATE FUNCTION is_armstrong_number(num INT) RETURNS BOOLEAN

BEGIN

 DECLARE original_num INT;

 DECLARE num_digits INT;

 DECLARE sum INT;

 DECLARE digit INT;

 SET original_num = num;

 SET num_digits = 0;

 SET sum = 0;
 Count the number of digits in the number

 WHILE num > 0 DO

 SET num_digits = num_digits + 1;

 SET num = num DIV 10;

 END WHILE;

 -- Reset num to its original value

 SET num = original_num;

 -- Calculate the sum of each digit raised to the power of the number of digits

 WHILE num > 0 DO

 SET digit = num % 10;

 SET sum = sum + POW(digit, num_digits);

 SET num = num DIV 10;

 END WHILE;

 -- Check if the sum is equal to the original number

 RETURN sum = original_num;

END;

Call this function in MYSQL,

SELECT is_armstrong_number(153); -- This will return true since 153 is an Armstrong 

number
