
##e suposto as var tarem inited antes de serem usadas como args ou em expr?
int alg(int test, <string> boas) {
    int i; ##shouldnt give error
    float a; ##shouldnt give error
    string p; ##shouldnt give error

    f(i); ##shouldnt give error
    f(i,i); ##should give error
    f(a); ##should give error

    c(1, b(test, 'boas'), f(1)); ##shouldnt give error
	b(test, 'boas'); ##shouldnt give error
	c(1, b(true, 'boas'), f(1)); ##should give error
	c(1, b(test, 'boas'), f(1.0)); ##should give error
	c(true, b(test, 'boas'), f(1)); ##should give error

	writeln(b(test, 'boas'), c(1, b(test, 'boas'), f(1))); ##shouldnt give error
	writeln(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), 1,1, 1); ##shouldnt give error
	writeln(b(test, 'boas')); ##shouldnt give error

	writeln(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), null); ##should give error
    writeln(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), 1,1, 1, null); ##should give error
    writeln(null, b(test, 'boas')); ##should give error
    writeln(fdsfsf(), b(test, 'boas')); ##should give error


    write(b(test, 'boas'), c(1, b(test, 'boas'), f(1))); ##shouldnt give error
    write(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), 1,1, 1); ##shouldnt give error
    write(b(test, 'boas')); ##shouldnt give error

    write(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), null); ##should give error
    write(b(test, 'boas'), c(1, b(test, 'boas'), f(1)), 1,1, 1, null); ##should give error
    write(null, b(test, 'boas')); ##should give error
    write(fdsfsf(), b(test, 'boas')); ##should give error


    write(fdsfsf(), 1,4, 'dsadsa', true); ##should give error
    write(1,4, 'dsadsa', true); ##shouldnt give error

    writeln(fdsfsf(), 1,4, 'dsadsa', true); ##should give error
    writeln(1,4, 'dsadsa', true); ##shouldnt give error
}

<int> fdsfsf() {
	<int> p = [232]; ##shouldnt give error
	<int> dfnsufnd = p+1;
	return p; ##shouldnt give error
}

int f(int x)
{
    x = x + 1;
    return x;
}

string b(float p, string c) {
	return 'p';
}

bool c(int fndsvdmsk, string csdnkncdsk, float fdsfds)
{
	return true;
}
