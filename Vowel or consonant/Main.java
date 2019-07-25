#include<iostream>
#include<ctype.h>
using namespace std;

int main()
{
  char c;
  cin>>c;
  c=toupper(c);
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    cout<<"Vowel";
  else
    cout<<"Consonant";
  return 0;
}