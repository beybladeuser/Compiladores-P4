int alg(int test, <string> boas) {
	int fdsdfs = 1 % 2.1; ##should give error
	int fdsdfsd = 1.1 % 2; ##should give error
	int fdsdfsdf = 1.1 % 2.1; ##should give error
	float fdsdfsdfs = 1.1 % 2.1; ##should give error
	float fdsdfsdfss = 1 % 2; ##shouldnt give error

	<int> p = [4];
	string dfsd;

	float fdsdfsdfssds = p[(p[1])] % 2; ##shouldnt give error
	float fdsdfsdfssdsfds = p[('boas')] % 2; ##should give error
	int fdsdfsdfssdsfsd = p[(dfsd)] % 2; ##should give error

	return 1 % 2; ##shouldnt give error
}