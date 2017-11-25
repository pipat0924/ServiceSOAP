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
	:serviceNo, 
	:amounTex, 
	:discount, 
	:vatAmount, 
	:payAmount,
	:description, 
	'A', 
	:cancelby, 
	:cancelDate, 
	:cancelReason, 
	:sessionCancel,
	:createDate,
	:cancelReasonId, 
	:cancelNote, 
	:repay, 
	:creditnoteno, 
	:newReceipt, 
	:approve_date, 
	:cancelApprove
	);