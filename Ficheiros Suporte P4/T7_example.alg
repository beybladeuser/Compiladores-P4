int alg(int n, <string> args)
{
    int j = 0;
    int i = 0;
    int total = 0;

    while(i < 10) do
    {
        j = 0;
        if(total > 100) then restart;
        while(j < 5) do
        {
            if(i*j>10) then
            {
                leave;
            }

            total = total + i*j;
        } finally total = total + 5;
    }

    return total;
}