CREATE TABLE PEUSER
(
    PE001ID          NUMBER(20, 0) PRIMARY KEY, --آی دی جدول
    PE001FIRSNAM     VARCHAR2(20),              --نام کاربر
    PE001LSTNAM      VARCHAR2(20),              -- نام خانوادگی کاربر
    PE001BIRTDAT     DATE,                      --تاریخ تولد کاربر
    PE001USRNAM      VARCHAR2(20) NOT NULL,     -- نام کاربری
    PE001USRPASS     VARCHAR2(50) NOT NULL,     -- رمزورود کاربری
    PE001NATIONALCOD VARCHAR2(20) UNIQUE,       -- کد ملی کاربر
    PE001MOBNUM      VARCHAR2(11) NOT NULL,     -- شماره همراه کاربر
    PE001EMAIL       VARCHAR2(50) NOT NULL,     -- ایمیل کاربر
    PE001ISUDAT      TIMESTAMP,                 -- تاریخ ثبت
    PE001EXPDAT      TIMESTAMP                  -- تاریخ انقضای کاربر
)
/
