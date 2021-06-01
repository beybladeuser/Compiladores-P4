void f1(<string> x)
{
    return;
}

int f2()
{
    return 10;
}

int f(int x, int y)
{
    <string> list = [5];
    f1(list);
    return x + f2();
}

int alg(int n, <string> args)
{
    int a,b;
    a = 2;
    b = 3;
    return f(a,b);
}