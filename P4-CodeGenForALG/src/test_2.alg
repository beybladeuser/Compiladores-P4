int alg(int test, <string> boas) {
	<int> p = [1]; ##shouldnt give error

	<int> gieasnjds = null; ##shouldnt give error

	int fgfdvbv = p[2] + 2; ##shouldnt give error
    string gfdgdgn = p[2] + 2; ##should give error
    float dfdsigdnif = p[2] + 2; ##shouldnt give error, because int can be converted into float
    float gfdfgdgfd = p[2] + 2.1; ##shouldnt give error, because int can be converted into float
    int gfdfgdgfdfdf = p[2] + 2.1; ##should give error
    int gfdfgdgfdfdfdf = 2.4 + 2.1; ##should give error
    float gfdfgdgfdfdfdfdf = 2.4 + 2.1; ##shouldnt give error

    int fgfdvbv_ = p[2] - 2; ##shouldnt give error
    string gfdgdgn_ = p[2] - 2; ##should give error
    float dfdsigdnif_ = p[2] - 2; ##shouldnt give error, because int can be converted into float
    float gfdfgdgfd_ = p[2] - 2.1; ##shouldnt give error, because int can be converted into float
    int gfdfgdgfdfdf_ = p[2] - 2.1; ##should give error
    int gfdfgdgfdfdfdf_ = 2.4 - 2.1; ##should give error
    float gfdfgdgfdfdfdfdf_ = 2.4 - 2.1; ##shouldnt give error


    <int> vdfsdf = p+2; ##shouldnt give error
    <string> fdsfgdfgfd = p+2; ##should give error
    <int> vdfsdfbfdb = p+2.1; ##should give error
    <string> fdsfgdfgfddfs = fdsfgdfgfd+2.1; ##should give error
    <string> fdsfgdfgfddfsfd = fdsfgdfgfd+2; ##shouldnt give error
    <string> fdsfgdfgfddfsfdgf = p+2; ##should give error
    <int> vdfsdfbfdfdfb = fdsfgdfgfddfsfdgf+2; ##should give error


	return 1 + 2 - 1; ##shouldnt give error
}