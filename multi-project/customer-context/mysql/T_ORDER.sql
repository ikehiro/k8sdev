---------------------------------------
-- TABLE_NAME : 受注
-- TABLE_ID   : T_ORDER
---------------------------------------
CREATE TABLE T_ORDER (
    ORDER_NO                       INTEGER        
  , ORDER_DATE                     DATE           
  , CORPORATE_NUMBER               CHAR           (12)
  , PRODUCT_CODE                   CHAR           (7)
  , UNIT                           INTEGER        
);
