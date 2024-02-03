#include <iostream>
using namespace std;

int main() {
    string ulang = "Y";
    while(ulang == "y" || ulang == "Y"){
    int batas;
    cout<<"berapa nomor telepon yang ingin anda simpan? ";
    cin>>batas;
    string noHp[batas];
    int start = 0;
    while (start < batas) {
        cout << "Anda dapat memasukkan nomor ke "<<start+1<<" : ";
        cin>>noHp[start];
        start++;
    }
    cout<<"=======Input Nomor selesai======="<<endl;
    cout<<"berikut Datanya : "<<endl;
    int show =0;
    while (show<batas){
        cout<<"nomor hp ke "<<show+1<<" : "<<noHp[show]<<endl;
        show++;
    }
    cout<<"apakah ingin mengulang (y for loop) : ";
    cin>>ulang;
    }

    return 0;
}