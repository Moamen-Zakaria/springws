-- Create department table if not exists
CREATE TABLE department (
      department_id INTEGER NOT NULL,
      department_name VARCHAR(255),
    PRIMARY KEY (department_id)
    );

-- Create employee table if not exists
CREATE TABLE employee (
    employee_id VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    department_department_id INTEGER,
    PRIMARY KEY (employee_id),
    CONSTRAINT FKiojsy23dwh2w9geqmvn955dqp FOREIGN KEY (department_department_id)
    REFERENCES department (department_id)
    );