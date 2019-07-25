#include <iostream>
#include<string.h>
using namespace std;

int main() {
	char a;
  	cin>>a;
  	if(isupper(a))
    {
      a=tolower(a);
      cout<<a;
    }
  	else
    {
      a=toupper(a);
      cout<<a;
    }
	return 0;
}