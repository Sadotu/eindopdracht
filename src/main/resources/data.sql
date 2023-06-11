INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (101, 'document', 'document', 'docx', 1024.5, 'documents/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (102, 'image', 'image', 'png', 2048.0, 'images/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (103, 'presentation', 'document', 'pptx', 5120.75, 'presentations/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (104, 'video', 'video', 'mp4', 8192.0, 'videos/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (105, 'spreadsheet', 'document', 'xlsx', 3072.25, 'spreadsheets/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (106, 'audio', 'audio', 'mp3', 512.75, 'audio/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (107, 'code', 'text', 'java', 204.5, 'code/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (108, 'archive', 'archive', 'zip', 4096.0, 'archives/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (109, 'document2', 'document', 'pdf', 512.0, 'documents/', '2023-05-18');

INSERT INTO files (id, file_name, type, extension, size, location, upload_date)
VALUES (110, 'image2', 'image', 'jpg', 1024.0, 'images/', '2023-05-18');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (101, 'Event A', '2023-05-22T09:00:00', '2023-05-22T11:00:00', 'First event', 'red');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (102, 'Event B', '2023-05-23T14:30:00', '2023-05-23T16:30:00', 'Second event', 'blue');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (103, 'Event C', '2023-05-24T18:00:00', '2023-05-24T20:00:00', 'Third event', 'green');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (104, 'Event D', '2023-05-25T10:00:00', '2023-05-25T12:00:00', 'Fourth event', 'yellow');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (105, 'Event E', '2023-05-26T16:00:00', '2023-05-26T18:00:00', 'Fifth event', 'purple');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (106, 'Event F', '2023-05-27T09:30:00', '2023-05-27T11:30:00', 'Sixth event', 'orange');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (107, 'Event G', '2023-05-28T13:00:00', '2023-05-28T15:00:00', 'Seventh event', 'pink');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (108, 'Event H', '2023-05-29T17:30:00', '2023-05-29T19:30:00', 'Eighth event', 'brown');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (109, 'Event I', '2023-05-30T12:00:00', '2023-05-30T14:00:00', 'Ninth event', 'gray');

INSERT INTO events (id, name, start_time, end_time, description, color)
VALUES (110, 'Event J', '2023-05-31T11:00:00', '2023-05-31T13:00:00', 'Tenth event', 'cyan');

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (101, 'Task A', '2023-06-01', 'Task A description', true, false);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (102, 'Task B', '2023-06-02', 'Task B description', false, true);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (103, 'Task C', '2023-06-03', 'Task C description', true, true);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (104, 'Task D', '2023-06-04', 'Task D description', false, false);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (105, 'Task E', '2023-06-05', 'Task E description', true, false);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (106, 'Task F', '2023-06-06', 'Task F description', false, true);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (107, 'Task G', '2023-06-07', 'Task G description', true, true);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (108, 'Task H', '2023-06-08', 'Task H description', false, false);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (109, 'Task I', '2023-06-09', 'Task I description', true, false);

INSERT INTO tasks (id, name_task, deadline, description, accepted, completed)
VALUES (110, 'Task J', '2023-06-10', 'Task J description', false, true);

INSERT INTO users (email, full_name, pronouns, age, phone_number, bio, password, newsletter, role, active)
VALUES ('john.doe@example.com', 'John Doe', 'he/him', 25, '1234567890', 'I am a software engineer', 'password1', true, 'user', true);

INSERT INTO users (email, full_name, pronouns, age, phone_number, bio, password, newsletter, role, active)
VALUES ('jane.smith@example.com', 'Jane Smith', 'she/her', 30, '9876543210', 'I am a designer', 'password2', true, 'user', true);

INSERT INTO users (email, full_name, pronouns, age, phone_number, bio, password, newsletter, role, active)
VALUES ('michael.johnson@example.com', 'Michael Johnson', 'he/him', 35, '5555555555', 'I am a teacher', 'password3', true, 'user', true);

INSERT INTO users (email, full_name, pronouns, age, phone_number, bio, password, newsletter, role, active)
VALUES ('emily.davis@example.com', 'Emily Davis', 'she/her', 28, '1111111111', 'I am a writer', 'password4', true, 'user', true);

INSERT INTO users (email, full_name, pronouns, age, phone_number, bio, password, newsletter, role, active)
VALUES ('david.wilson@example.com', 'David Wilson', 'he/him', 32, '9999999999', 'I am an accountant', 'password5', true, 'user', true);

