-- DB切り替え
\c todoapp

-- テーブル作成
CREATE TABLE  todoschema.task_list (
  task_list_id VARCHAR(10) NOT NULL,
  task_name VARCHAR(50) NOT NULL,
  dead_line TIMESTAMPTZ NOT NULL,
  done boolean NOT NULL,
  PRIMARY KEY (task_list_id)
);

-- 権限追加
GRANT ALL PRIVILEGES ON todoschema.task_list TO todo;

-- サンプルレコード作成
INSERT INTO todoschema.task_list VALUES('0000000001', 'task_1', '2022-08-01 10:00:00', FALSE);
INSERT INTO todoschema.task_list VALUES('0000000002', 'task_2', '2022-08-01 10:00:00', FALSE);
INSERT INTO todoschema.task_list VALUES('0000000003', 'task_3', '2022-08-01 10:00:00', FALSE);