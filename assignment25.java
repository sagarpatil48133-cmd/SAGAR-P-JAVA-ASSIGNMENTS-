CREATE TABLE Students (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(15) UNIQUE NOT NULL,
    address VARCHAR(200)
);
Insert three records:
INSERT INTO Students
(roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(1, 'Arun', 18, '2008-05-10', 'arun@gmail.com', '9876543210', 'Bangalore');

INSERT INTO Students
(roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(2, 'Rahul', 19, '2007-08-15', 'rahul@gmail.com', '9876543211', 'Mysore');

INSERT INTO Students
(roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(3, 'Kiran', 18, '2008-02-20', 'kiran@gmail.com', '9876543212', 'Belagavi');
To display the records:
SELECT * FROM Students;
