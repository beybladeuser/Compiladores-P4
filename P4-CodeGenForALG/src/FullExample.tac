	y = 3
	j = jo?o 
	z = 3.5
	a1 = _t0
	a2 = _t1
f1:
	BeginFunc 104
	i = 0
	j = 0
	total = 0
	subtotal = 0
_Lbefore0:
	_t2 = i < n1
	ifFalse _t2 goto _Lafter1
	j = 0
	subtotal = 0
_Lbefore2:
	_t3 = j < n2
	ifFalse _t3 goto _Lafter3
	_t4 = i * 4
	_t5 = a[_t4]
	_t6 = j * 4
	_t7 = a[_t6]
	_t8 = _t5 / _t7
	_t9 = (FLOAT) _t8
	_t10 = subtotal + _t9
	subtotal = _t10
	_t11 = subtotal > total
	ifFalse _t11 goto _Lfalse4
	goto _Lafter3
_Lfalse4:
	_t12 = j + 1
	j = _t12
	goto _Lbefore2
_Lafter3:
	_t13 = total + subtotal
	total = _t13
	_t14 = i + 1
	i = _t14
	goto _Lbefore0
_Lafter1:
	_t15 = (FLOAT) 10
	_t16 = total + _t15
	total = _t16
	return total
	EndFunc 
alg:
	BeginFunc 56
	_t17 = 0 * 4
	a1[_t17] = 0
	_t18 = 1 * 4
	a1[_t18] = 1
	_t19 = 2 * 4
	a1[_t19] = 2
	_t20 = 0 * 4
	a2[_t20] = 3
	_t21 = 1 * 4
	a2[_t21] = 4
	param a1
	param a2
	param 3
	param 2
	_t22 = call f1,4
	result = _t22
	_t23 = (FLOAT) 0
	_t24 = result > _t23
	ifFalse _t24 goto _Lfalse5
	return result
	goto _Lnext6
_Lfalse5:
	_t25 = - result
	return _t25
_Lnext6:
	halt 
