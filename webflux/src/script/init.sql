-- DB作成
CREATE DATABASE todo;

-- 作成したDBへ切り替え
\c todo

-- スキーマ作成
CREATE SCHEMA todoschema;

-- ロールの作成
CREATE ROLE todo WITH LOGIN PASSWORD 'password';

-- 権限追加
GRANT ALL PRIVILEGES ON SCHEMA todoschema TO todo;