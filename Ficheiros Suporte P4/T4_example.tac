f:
	BeginFunc 428
	z = _t0
	_t1 = 200 + 100
	param _t1
	w = call _ST_ALLOC 1
	_t2 = x + y
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
