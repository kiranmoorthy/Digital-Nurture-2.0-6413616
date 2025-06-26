-- STEP 1: Create the procedure


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    
    FOR rec IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) 
    LOOP
        
        UPDATE Accounts
        SET Balance = Balance + (rec.Balance * 0.01)
        WHERE AccountID = rec.AccountID;
    END LOOP;

    COMMIT;
END;
/


-- STEP 2: Run the procedure
-- Usage: Run this command separately after compiling the above procedure

EXEC ProcessMonthlyInterest;
