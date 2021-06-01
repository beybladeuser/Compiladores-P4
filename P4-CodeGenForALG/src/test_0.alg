int x;
int y = 0;
string H;

string ppfdskodfdsp;

int alg(int test, <string> boas)
{
	<int> p = [1]; ##shouldnt give error
	<int> hgfhgf = ['boas']; ##should give error

	int ppfdskodfdsp; ##shouldnt error

	int tgdfgdgd, vfdcvdf, cdscdsc; ##shouldnt error

	int tgdfgdgd; ##should error
	int vfdcvdf; ##should error
	int cdscdsc; ##should error

	int y = p[2]; ##shouldnt give error
	int resrsd = (p[2]); ##shouldnt give error
	(*should this be allowed
	<int> rsfsdfdsf = ?(p[2]);
	*)
	<int> rsfsdfdsf = ?p[2]; ##shouldnt give error
	<int> rsfsdfdsfe = ?y; ##shouldnt give error
	<int> rsfsdfdsfd = ?2; ##should give error
	<int> rsfsdfdsfds = ?p; ##should give error

	int fgfdvbv = p[2] * 2; ##shouldnt give error
	string gfdgdgn = p[2] * 2; ##should give error
	float dfdsigdnif = p[2] * 2; ##shouldnt give error, because int can be converted into float
	float gfdfgdgfd = p[2] * 2.1; ##shouldnt give error, because int can be converted into float
	int gfdfgdgfdfdf = p[2] * 2.1; ##should give error
	int gfdfgdgfdfdfdf = 2.4 * 2.1; ##should give error
	float gfdfgdgfdfdfdfdf = 2.4 * 2.1; ##shouldnt give error


	int fgfdvbv_ = p[2] / 2; ##shouldnt give error
    string gfdgdgn_ = p[2] / 2; ##should give error
    float dfdsigdnif_ = p[2] / 2; ##shouldnt give error, because int can be converted into float
    float gfdfgdgfd_ = p[2] / 2.1; ##shouldnt give error, because int can be converted into float
    int gfdfgdgfdfdf_ = p[2] / 2.1; ##should give error
    int gfdfgdgfdfdfdf_ = 2.4 / 2.1; ##should give error
    float gfdfgdgfdfdfdfdf_ = 2.4 / 2.1; ##shouldnt give error



	string z = p[2]; ##z and p[i] are of diferent types, should give error
	z = p[z]; ##z is string, should should give error
	z = p[1]; ##z is string, should should error
	p = x[1]; ## x is not pointer, should give error

	ppfdskodfdsp = 1; ##shouldnt error

	return; ##no proper return, should give error
}

int f()
{
	return; ##no proper return, should give error
}

int ffdsfcv()
{
	return 1; ##proper return, shouldnt give error
}

void z(<int> p, string x)
{

	return; ##proper return, shouldnt give error
}

int f()
{

}

void z(<int> p, string x) ##should give error
{

	return; ##proper return, shouldnt give error
}