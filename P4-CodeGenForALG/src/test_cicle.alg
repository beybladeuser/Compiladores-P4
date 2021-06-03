int f(int x)
{
    int zz;
    while zz + 1 do {
        x = 2;
        restart; ##should error
        leave;
    }
    finally {
    	leave; ##should error
    }
    while zz + 1 do {
            x = 2;
            leave; ##should error
            restart;
        }
   	finally {
       	restart; ##should error
    }
    restart; ##should error
    leave; ##should error
    x = 3;
    return x;
}


int alg(int test, <string> boas) {
    int s = 0;
    float x;
    f(x); ##should error
    return s;
}

