-- STEP 1: Add isVip column to Customers table
-- This column marks customers as VIP ('Y') or not ('N')

ALTER TABLE Customers
ADD isVip CHAR(1) DEFAULT 'N';



-- STEP 2: PL/SQL Block to Mark VIP Customers

BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance FROM Customers
    ) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET isVip = 'Y'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/