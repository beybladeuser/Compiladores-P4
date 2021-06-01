int alg(int test, <string> boas) {
	<int> p = [1]; ##shouldnt give error

	bool gfdgfd = p > 0; ##should give error
	bool gfdgfddas = p[0] > 0; ##shouldnt give error
	int gfdgfdfdfd = p[0] > 0; ##should give error
	bool gfdgfddasfds = p[0] > 0.2 * 2; ##shouldnt give error

	bool gfdgfddasfdsds = p[0] >= 0.2 * 2; ##shouldnt give error
	bool gfdgfddasfdsdgfds = 0 >= 0.2 * 2; ##shouldnt give error
	bool gfdgfddasfdsdhgs = 0.1 >= 0.2 * 2; ##shouldnt give error
	bool gfdgfddasfdsdhgfs = 0 >= 0 * 2; ##shouldnt give error

	bool gfdgfddasfdsds = p[0] == 0.2 * 2; ##should give error
	bool gfdgfddasfdsdsd = p[0] == 0 * 2; ##shouldnt give error
	bool gfdgfddasfdsdsdgfdd = 0 == 0 * 2; ##shouldnt give error
	bool gfdgfddasfdsdsdgfd = 'boas' == '0 * 2'; ##shouldnt give error
	bool gfdgfddasfdsdsdgfbvvcbvcd = 'boas' != '0 * 2'; ##shouldnt give error
	bool gfdgfddasfdsdsdgfd = 'boas' == 0 * 2; ##should give error
	bool gfdgfddasfdsdsdgfdbfd = 'boas' != 0 * 2; ##should give error
	int gfdgfddasfdsdsdgfdjgh = 'boas' == '0 * 2'; ##shouldnt give error


	bool asdnfdns = p == null; ##shouldnt give error
	bool asdnfdnsds = p != null; ##shouldnt give error
	bool asdnfdnsdfbdbfs = p != boas; ##should give error
	<string> gdfdf;

	bool asdnfdnsdfbdbfs__ = gdfdf != boas; ##shouldnt give error
	bool asdnfdnsdfbdbfsfsdsdsdsdsddd = gdfdf == boas; ##shouldnt give error
	bool asdnfdnsdfbdbfsfsdsdsdsdsddhgfd = null == boas; ##shouldnt give error

	return 1 + 2 - 1; ##shouldnt give error
}