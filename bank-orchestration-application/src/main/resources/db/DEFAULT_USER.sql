-- Create the user
create
user PB_BANK_ORCHESTRATION
  default tablespace USERS
  temporary tablespace TEMP
  password expire;
-- Grant/Revoke object privileges
grant insert, update, delete on SYS.ALL_ALL_TABLES to PB_BANK_ORCHESTRATION;
grant select on SYS.ALL_ALL_TABLES to PB_BANK_ORCHESTRATION with grant option;
grant insert, update, delete on SYS.ALL_APPLY to PB_BANK_ORCHESTRATION;
grant select on SYS.ALL_APPLY to PB_BANK_ORCHESTRATION with grant option;
grant insert, update, delete on SYS.ALL_APPLY_TABLE_COLUMNS to PB_BANK_ORCHESTRATION;
grant select on SYS.ALL_APPLY_TABLE_COLUMNS to PB_BANK_ORCHESTRATION with grant option;
grant insert, update, delete on SYS.ALL_ARGUMENTS to PB_BANK_ORCHESTRATION;
grant select on SYS.ALL_ARGUMENTS to PB_BANK_ORCHESTRATION with grant option;
grant execute on SYS.DBMS_STATS to PB_BANK_ORCHESTRATION;
-- Grant/Revoke role privileges
grant connect to PB_BANK_ORCHESTRATION;
grant resource to PB_BANK_ORCHESTRATION;
-- Grant/Revoke system privileges
grant
alter
session to PB_BANK_ORCHESTRATION;
grant create
database link to PB_BANK_ORCHESTRATION;
grant
create sequence to PB_BANK_ORCHESTRATION;
grant
create
session to PB_BANK_ORCHESTRATION;
grant create
synonym to PB_BANK_ORCHESTRATION;
grant
create view to PB_BANK_ORCHESTRATION;
grant
unlimited
tablespace to PB_BANK_ORCHESTRATION;
/