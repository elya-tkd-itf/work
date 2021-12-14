#include <iostream>
#include <math.h>

using namespace std;

void my_ln(double x, double eps){
    double el = 1, sum = 0; int n = 0;
    while (fabs(el) > eps){
        el = pow(-1, n)*pow(x-1, n+1)/(n+1);
        sum += el; n++;
    }
    cout << "my_ln = " << sum << "; ln = " << log(x) << endl;
}

double my_ex(double l, double r){
    cout << l << " " << r << endl;
    double m = (l+r)/2;

    double m_res = sqrt(1-m) - tan(m);
    double r_res = sqrt(1-r) - tan(r);

    if (fabs(l-r) <= 0.00001){
        return m;
    }
    if (m_res * r_res > 0) return my_ex(l, m);
    else return my_ex(m, r);
}

int main()
{
    my_ln(2, 0.001);
    double ex = my_ex(0,1);
    cout << "x of my_ex = " << ex << "; res = " << sqrt(1-ex) - tan(ex) << endl;
    return 0;
}
