int f(int x)
@{
    zz = 0; ##should give error
    return x; ##shouldnt give error
}
{
    int zz; ##shouldnt give error
    float f = 0; ##shouldnt give error
    {
        x = null; ##should give error
        return x;
    }
    f = zz; ##shouldnt give error
    return x; ##should give error
    x = zz; ##shouldnt give error
}
>>{
 zz = 1; ##shouldnt give error
}


int alg(int test, <string> boas) {
    int s = 0; ##shouldnt give error
    float x; ##shouldnt give error
    s = f(x); ##should give error
    return s; ##shouldnt give error
}

