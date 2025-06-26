-- STEP 1: Create the stored procedure


CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,   
    p_to_account   IN NUMBER,   
    p_amount       IN NUMBER    
) AS
    v_balance NUMBER;
BEGIN
 
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;

    
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT;
END;
/

-- STEP 2: Run the procedure

EXEC TransferFunds(101, 102, 500);

