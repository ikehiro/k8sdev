---------------------------------------
-- TABLE_NAME : 顧客
-- TABLE_ID   : T_CUSTOMER
---------------------------------------
CREATE TABLE T_CUSTOMER (
    SEQUENCE_NUMBER                INTEGER        
  , CORPORATE_NUMBER               CHAR           (12)
  , NAME                           VARCHAR        (150)
  , FURIGANA                       VARCHAR        (500)
  , POST_CODE                      INTEGER        
  , PREFECTURE_NAME                VARCHAR        (10)
  , CITY_NAME                      VARCHAR        (20)
  , STREET_NUMBER                  VARCHAR        (300)
);
