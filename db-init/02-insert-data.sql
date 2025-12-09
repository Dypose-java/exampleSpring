INSERT INTO users (email, name) VALUES
    ('ivan.ivanov@example.com', 'Иван Иванов'),
    ('petr.petrov@example.com', 'Петр Петров'),
    ('maria.sidorova@example.com', 'Мария Сидорова'),
    ('alexey.kuznetsov@example.com', 'Алексей Кузнецов'),
    ('elena.vorobeva@example.com', 'Елена Воробьева')
ON CONFLICT (email) DO NOTHING;