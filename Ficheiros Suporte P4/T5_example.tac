f1:
	BeginFunc 0
	return
	EndFunc 
f2:
	BeginFunc 0
	return 10
	EndFunc 
f:
	BeginFunc 32
	list = _t0
	param list
	call f1,1
	_t1 = call f2,0
	_t2 = x + _t1
	return _t2
	EndFunc 
alg:
	BeginFunc 12
	a = 2
	b = 3
	param a
	param b
	_t3 = call f,2
	return _t3
	halt 
