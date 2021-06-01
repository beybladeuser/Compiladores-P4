int f; ##should error

int alg(int test, <string> boas) {

	return 1; ##shouldnt error
}

int f()
{
	return 1; ##shouldnt error
}

int ffdsfcv()
{
	return 1; ##shouldnt error
}

void z(<int> p, string x)
{
	return 1; ##should error
}

string fp()
{
	if true then {
		return; ##should error
	}
	if true then {
    	return 'boas'; ##shouldnt error
    }
	if true then {
    	return 1; ##should error
    }
    if true then {
      	return 'boas'; ##should error
      	f(); ##shouldnt error
    }
    if true then {
          	return 'boas'; ##should error
          	z(1, 'boas'); ##should error
    }
    if true then
    	return 'boas'; ##shouldnt error?????????????????????
	return 'boas'; ##expected error
	f(); ##shouldnt error
}