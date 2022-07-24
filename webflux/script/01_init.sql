-- DB作成
CREATE DATABASE todoapp;

-- 作成したDBへ切り替え
\c todoapp

-- スキーマ作成
CREATE SCHEMA todoschema;

-- ロールの作成
CREATE ROLE todo WITH LOGIN PASSWORD 'password';

-- 権限追加
GRANT ALL PRIVILEGES ON SCHEMA todoschema TO todo;