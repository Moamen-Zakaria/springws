TRUNCATE table employee CASCADE;
TRUNCATE table department CASCADE;

-- Insert sample data into department table
INSERT INTO department (id, department_name)
VALUES
    (1, 'HR'),
    (2, 'Engineering'),
    (3, 'Sales'),
    (4, 'Software'),
    (5, 'Marketing');

-- Insert sample data into employee table
INSERT INTO employee (id, email, first_name, last_name, department_id)
VALUES
    ('emp1', 'emp1@example.com', 'John', 'Doe', 1),
    ('emp2', 'emp2@example.com', 'Jane', 'Smith', 1),
    ('emp3', 'emp3@example.com', 'Michael', 'Johnson', 2),
    ('emp4', 'emp4@example.com', 'Emily', 'Williams', 2),
    ('emp5', 'emp5@example.com', 'David', 'Brown', 3),
    ('emp6', 'emp6@example.com', 'Sophia', 'Davis', 3),
    ('emp7', 'emp7@example.com', 'Daniel', 'Miller', 4),
    ('emp8', 'emp8@example.com', 'Olivia', 'Wilson', 4),
    ('emp9', 'emp9@example.com', 'Matthew', 'Martinez', 1),
    ('emp10', 'emp10@example.com', 'Ava', 'Taylor', 2);