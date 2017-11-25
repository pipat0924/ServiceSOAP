UPDATE TBMNPTRSRECEIPTDETAIL
	SET
		CANCELDATE = :cancelDate, 
		CANCELREASON = :cancelReason , 
		CANCELREASONID = :cancelReasonId , 
		CANCELNOTE = :cancelNote ,
		CANCELAPPROVE = :cancelApprove
		
	WHERE RECEIPTID = :receiptId 
	--AND SERVICENO = :serviceNo
