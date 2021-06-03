int alg(int test, <string> boas)
{
	p = 1; ##should give error

	return 1;
}

int b() {
	int p; ##shouldnt give error
	<int> z; ##shouldnt give error
	<string> adsad;
	string fndsfnksd;
	bool masOlhe;
	p = 1; ##shouldnt give error

	z[2] = 1; ##shouldnt give error

	z['boas'] = 1; ##should give error

	z[p] = 1; ##shouldnt give error

	z[1] = p; ##shouldnt give error

	z[1] = 'boas'; ##should give error

	z+1[1]; ##should give 2 erros
	(z+1)[1]; ##shouldnt give error
	?(z+1)[1]; ##shouldnt give error
	(z+1)[1] = 32; ##shouldnt give error
	(z+1)[1] = false; ##should give error

	(adsad+1)[b()] = 'masolhe'; ##shouldnt give error
	(adsad+1)[b()] = 1; ##should give error
	(adsad+1)[b()] = p; ##should give error
	(adsad+1)[b()] = fndsfnksd; ##shouldnt give error
	(adsad+1)[b()] = false; ##should give error

	p = 'boas'; ##should give error
	p = z[1+3] * b(); ##shouldnt give error
	fndsfnksd = 'boas'; ##shouldnt give error
	fndsfnksd = z[1+3] * b(); ##should give error
	masOlhe = true; ##shouldnt give error
	masOlhe = false; ##shouldnt give error
	masOlhe = 1; ##should give error

	return 1;
}