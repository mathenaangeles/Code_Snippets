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

#define MAXSIZE 100000

struct land {
    int vertex;
    int price;
    int right;
    int left;
    int up;
    int down;
};

int findMinimumCostPath(int array[], int n){

    struct land matrix[n][n];
    int index=0;
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            matrix[i][j].vertex=index;
            matrix[i][j].price=array[index];
            index+=1;
        }
    }
    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if (i==0){
                matrix[i][j].up=-1;
            } else {
                matrix[i][j].up=matrix[i-1][j].vertex;
            }
            if (i==n-1){
                matrix[i][j].down=-1;
            } else {
                matrix[i][j].down=matrix[i+1][j].vertex;
            }
            if (j==n-1){
                matrix[i][j].right=-1;
            } else{
                matrix[i][j].right=matrix[i][j+1].vertex;
            }
            if (j==0){
                matrix[i][j].left=-1;
            }else{
                matrix[i][j].left=matrix[i][j-1].vertex;
            }
        }
    }

    int N=n*n;
    index=0;
    struct land graph[n];
    for(int i = 0; i < n; ++i){
        for(int j = 0; j < n; ++j){
          graph[i * n + j] = matrix[i][j];
        }
    }

    int **adjacency = new int*[N];
    for (int i=0;i<N;i++){
        adjacency[i]=new int[N];
    }
    index=0;
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(i==j){
                adjacency[i][j]=0;
            } else if (j==graph[index].up){
                adjacency[i][j]=graph[graph[index].up].price;
            } else if (j==graph[index].right){
                adjacency[i][j]=graph[graph[index].right].price;
            } else if (j==graph[index].left){
                adjacency[i][j]=graph[graph[index].left].price;
            } else if(j==graph[index].down){
                adjacency[i][j]=graph[graph[index].down].price;
            } else{
                adjacency[i][j]=MAXSIZE;
            }
        }
        index+=1;
    }

    /*
    for (int i=0;i<N;i++){
        for (int j=0;j<N;j++){
            if (adjacency[i][j]==MAXSIZE){
                cout << "INF,";
            } else{
                cout << adjacency[i][j] << ",";
            }
        }
        cout << "\n";
    }
    */

    int **cache = new int*[N];
    for (int i=0;i<N;i++){
        cache[i]=new int[N];
    }
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            cache[i][j] = adjacency[i][j];
        }
    }

    for (int k = 0; k < N; k++){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                if (cache[i][k] + cache[k][j] < cache[i][j]){
                    cache[i][j] = cache[i][k] + cache[k][j];
                }
            }
        }
    }

    /*
    for (int i=0;i<N;i++){
        for (int j=0;j<N;j++){
            if (cache[i][j]==MAXSIZE){
                cout << "INF,";
            } else{
                cout << cache[i][j] << ",";
            }
        }
        cout << "\n";
    }
    */

    return cache[0][N-1]+graph[0].price;
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
        }

        output << findMinimumCostPath(array,n) << "\n";
        cases--;
    }

    input.close();
    output.close();

    return 0;


}
