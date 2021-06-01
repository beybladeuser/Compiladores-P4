int x;
int y = 3;
string j = 'joão';
float z = 3.5;
<int> a1 = [3];
<int> a2 = [2];


float f1(<int> a, <int> b, int n1, int n2)
{
    int i = 0;
    int j = 0;
    float total;
    float subtotal;
    total = 0;
    subtotal = 0;

    while(i < n1) do
    {
        j = 0;
        subtotal = 0;
        while(j < n2) do
        {
            subtotal = subtotal + (a[i]/a[j]);
            if(subtotal > total) then
            {
                leave;
            }
            j = j+1;
        }
        total = total + subtotal;
        i = i+1;
    } finally total = total + 10;

    return total;
}


int alg(int n, <string> args)
{
    float result;
    a1[0] = 0;
    a1[1] = 1;
    a1[2] = 2;
    a2[0] = 3;
    a2[1] = 4;


    result = f1(a1,a2,3,2);
    if(result > 0) then
    {
        return result;
    }
    else
    {
        return -result;
    }
}