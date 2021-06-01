int alg(int test, <string> boas)
{
	p = 1; ##should give error

	return 1;
}

int b() {
	int p; ##shouldnt give error
	<int> z; ##shouldnt give error
	p = 1; ##shouldnt give error

	z[2] = 1; ##shouldnt give error

	z['boas'] = 1; ##should give error

	z[p] = 1; ##shouldnt give error

	z[1] = p; ##shouldnt give error

	z[1] = 'boas'; ##should give error

	z+1[1]; ##should give 2 erros
	(z+1)[1]; ##shouldnt give error
	?(z+1)[1]; ##shouldnt give error

	return 1;
}