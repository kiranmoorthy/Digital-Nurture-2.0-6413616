-- STEP 1: Create the stored procedure


CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,  
    p_bonus_pct  IN NUMBER      
BEGIN
    -- Update salaries with bonus
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;

    COMMIT;
END;
/


-- STEP 2: Run the procedure 

EXEC UpdateEmployeeBonus('Finance', 10);