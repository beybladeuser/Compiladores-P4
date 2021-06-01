alg:
	BeginFunc 44
	j = 0
	i = 0
	total = 0
_Lbefore0:
	_t0 = i < 10
	ifFalse _t0 goto _Lafter1
	j = 0
	_t1 = total > 100
	ifFalse _t1 goto _Lfalse2
	goto _Lbefore0
_Lfalse2:
_Lbefore3:
	_t2 = j < 5
	ifFalse _t2 goto _Lafter4
	_t3 = i * j
	_t4 = _t3 > 10
	ifFalse _t4 goto _Lfalse5
	goto _Lafter4
_Lfalse5:
	_t5 = i * j
	_t6 = total + _t5
	total = _t6
	goto _Lbefore3
_Lafter4:
	_t7 = total + 5
	total = _t7
	goto _Lbefore0
_Lafter1:
	return total
	halt 
