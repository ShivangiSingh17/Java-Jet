#include<iostream.h>
#include<conio.h>
#include<stdio.h>
void main()
{clrscr();
int sum =0;
cout<<"Enter number:"<<endl;
cin>>sum;
for(int i=1;i<100;i++)
{for(int j=1;j<100;j++)
{   if(sum == i+j)
{  cout<<"("<<i<<","<<j<<")"<<endl;
}
}
}
getch();
}
