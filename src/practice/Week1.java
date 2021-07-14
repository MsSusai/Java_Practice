package practice;

import java.util.Scanner;

public class Week1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
        in.close();
    }
}

class Fraction
{
    int fz;
    int fm;

    Fraction(int a, int b)
    {
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        this.fz = a;
        this.fm = b;
    }

    double toDouble()
    {
        double value;
        value = (double) fz / fm;
        return value;
    }

    int gcd(int x, int y)
    {
        if (y == 0)
        {
            return x;
        }
        else
        {
            return gcd(y, x % y);
        }
    }

    void simplify(Fraction a)
    {
        int gcd;
        gcd = gcd(a.fz, a.fm);
        a.fm /= gcd;
        a.fz /= gcd;
    }

    Fraction plus(Fraction r)
    {
        Fraction r1 = new Fraction(r.fz, r.fm);
        r1.fm = this.fm * r.fm;
        r1.fz = this.fz * r.fm + this.fm * r.fz;
        simplify(r1);
        return r1;
    }

    Fraction multiply(Fraction r)
    {
        Fraction r2 = new Fraction(r.fz, r.fm);
        r2.fm = this.fm * r.fm;
        r2.fz = this.fz * r.fz;
        simplify(r2);
        return r2;
    }

    void print()
    {
        if (fz == fm)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(fz + "/" + fm);
        }
    }
}