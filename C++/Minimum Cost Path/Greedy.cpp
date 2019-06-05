#include <iostream>
#include <fstream>
#include <set>
#include <cmath>

/*
input.txt format
number of test cases
number of rows
prices/weight...
*/

using namespace std;

#define MAXSIZE 2147483647

struct land {
    int x;
    int y;
    int price;
    land(int x, int y, int price):
    x(x),
    y(y),
    price(price){}
};

bool operator<(const land &a, const land &b){
    if (a.price == b.price) {
        if (a.x != b.x){
            return (a.x < b.x);
        } else {
            return (a.y < b.y);
        }
    }
    return (a.price < b.price);
}

int findMinimumCostPath(int array[], int n){

    int matrix[n][n];
    int index=0;
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            matrix[i][j]=array[index];
            index+=1;
            //cout << matrix[i][j] << "    ";
        }
        //cout << "\n";
    }

    int cache[n][n];
    for (int i=0;i<n;i++){
         for (int j=0; j<n; j++){
            cache[i][j] = MAXSIZE;
         }
    }

    cache[0][0] = matrix[0][0];

    set<land> area;
    area.insert(land(0, 0, 0));

    int xVal[] = {1, -1, 0, 0};
    int yVal[] = {0, 0, 1, -1};

    while (!area.empty()){
        land ctr = *area.begin();
        area.erase(area.begin());

        for (int i = 0; i < 4; i++) {
            int x = ctr.x + xVal[i];
            int y = ctr.y + yVal[i];
            if (!(x >= 0 && x < n && y >= 0 && y < n)){
                continue;
            }
            if (cache[x][y] > cache[ctr.x][ctr.y] + matrix[x][y]){
                if (cache[x][y] != MAXSIZE){
                    area.erase(area.find(land(x, y, cache[x][y])));
                }
                cache[x][y] = cache[ctr.x][ctr.y] + matrix[x][y];
                area.insert(land(x, y, cache[x][y]));
            }
        }
    }

    return cache[n-1][n-1];
}

int main(){

    ifstream input;
    ofstream output;

    input.open("input.txt");
    output.open("output.txt");

    int cases;

    input >> cases;

    while (cases>0){

        int n = 0;
        input >> n;
        int array[n*n];

        for (int i=0; i<(n*n); i++){
            int temp;
            input >> temp;
            array[i] = temp;
            //cout << array[i] << "\n";
        }

        output << findMinimumCostPath(array,n) << "\n";
        cases--;
    }

    input.close();
    output.close();

    return 0;


}
