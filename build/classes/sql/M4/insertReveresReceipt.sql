INSERT 
	INTO TBMNPTRSRECEIPTDETAIL 
	(
	RECEIPTID ,
	SEQ ,
	SERVICENO ,
	AMOUNTEX  ,
	DISCOUNT  , 
	VATAMOUNT  ,
	PAYAMOUNT  ,
	DESCRIPTION  ,
	STATUS , 
	CANCELBY  , 
	CANCELDATE , 
	CANCELREASON  , 
	SESSIONCANCEL  , 
	CREATEDATE , 
	CANCELREASONID , 
	CANCELNOTE  , 
	REPAY , 
	CREDITNOTENO  ,
	NEWRECEIPT  , 
	APPROVE_DATE  , 
	CANCELAPPROVE 
	)
	VALUES 
	(
	:receiptId, 
	M3_RECEIPT_SEQ.NEXTVAL, 
	:serviceno, 
	:amountex, 
	:discount, 
	:vatamount, 
	:payamount,
	:description, 
	:status, 
	:cancelby, 
	:canceldate, 
	:cancelreason, 
	:sessioncancel,
	:createdate,
	:cancelreasonid, 
	:cancelnote, 
	:repay, 
	:creditnoteno, 
	:newreceipt, 
	:approve_date, 
	:cancelapprove
	);