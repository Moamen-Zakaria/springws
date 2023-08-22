-- Create department table if not exists
CREATE TABLE department (
      id INTEGER NOT NULL,
      department_name VARCHAR(255),
    PRIMARY KEY (id)
    );

-- Create employee table if not exists
CREATE TABLE employee (
    id VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    department_id INTEGER,
    PRIMARY KEY (id),
    CONSTRAINT departmentEmployeeForiegnKey FOREIGN KEY (department_id)
    REFERENCES department (id)
    );